package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import collections.app.Emp;
import collections.app.EmpApp;
import collections.app.EmpDb;

@WebServlet("/demo") 
public class FormServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String pid=req.getParameter("id");
		int id=Integer.parseInt(pid);
		
		String name=req.getParameter("name");
		String city=req.getParameter("city");         
		int salary=Integer.parseInt("salary");
		
		Emp e= new Emp(id,name,city,salary);
		
		EmpApp app=new EmpApp();
		String response=app.addPerson(p);
		
		System.out.println(EmpDb.db);
		out.write("<h1>"+response+"</h1>");
		
	}
}