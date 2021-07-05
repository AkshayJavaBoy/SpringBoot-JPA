package com.abhijeet.Testing;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Amol {
	private String name;
	@Id
	private int rollno;
	private String addr;

	@Override
	public String toString() 
	{
		return "Amol [name=" + name + ", rollno=" + rollno + ", addr=" + addr + "]";
	}

	public Amol(String name, int rollno, String addr) 
	{
		super();
		this.name = name;
		this.rollno = rollno;
		this.addr = addr;
	}

	public Amol()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getRollno()
	{
		return rollno;
	}

	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}

	public String getAddr() 
	{
		return addr;
	}

	public void setAddr(String addr)
	{
		this.addr = addr;
	}

	

}
