package com.manish.java.projects.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien   // Bean or POJO
{
	@Id
	private int anum ; 
	private String aname ;
	private String acolor ;
	public int getAnum() {
		return anum;
	}
	public void setAnum(int anum) {
		this.anum = anum;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAcolor() {
		return acolor;
	}
	public void setAcolor(String acolor) {
		this.acolor = acolor;
	}
	
	@Override
	public String toString() {
		return "Alien [anum=" + anum + ", aname=" + aname + ", acolor=" + acolor + "]";
	}
	
	

}
