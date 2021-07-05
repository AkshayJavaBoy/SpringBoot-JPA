package com.abhijeet.Testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhijeet.Testing.DSO.Dao;

@Controller
public class homeController
{
@Autowired
	Dao dao;

@RequestMapping("bro")
public String ho()
{
	return "kk.jsp";
}
 @RequestMapping("home")
 public String add(Amol a) 
	{
	 
	 String t=null;
//	 Akshay a1 = new Akshay();
//	 a1.setName("amol");
//	 a1.setAddr("new panvel boss");
//	 a1.setRollno(3);
	 
	 
	Amol result= (Amol)dao.save(a);
	 
//	 ModelAndView mv= new ModelAndView();
//	 mv.setViewName("show.jsp");
	System.out.println(a);
	if(!result.equals(""))
	{
	  t=  "login.jsp" ;
	}
	else
	{
		t="failed.jsp";
	}
	return t;
}
}
