package com.manish.java.projects.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Alien alien = new Alien() ; 
        
        alien.setAnum(101);
        alien.setAname("Manish");
        alien.setAcolor("Blue");
        
        // Creating Object of Laptop Class
        Laptop laptop = new Laptop() ; 
        laptop.setLid(103);
        laptop.setLname("MacBook");

        // Creating Object of Student Class
        Student student = new Student(); 
        student.setRollnum(1);
        student.setName("Manish"); 
        student.setMarks(99);
        
        student.getLaptop().add(laptop) ; 
        
//        student.setLaptop(laptop);
        
        
        
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class)
        		 .addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);  
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry(); 
        
        
        SessionFactory sf = config.buildSessionFactory(reg); 
        
        Session session = sf.openSession(); 
        
        
        Transaction tx = session.beginTransaction(); 
        
       // session.save(alien) ; 
        
        session.save(laptop) ; 
        session.save(student); 
        
        tx.commit();
        
        
        
        
    }
}
