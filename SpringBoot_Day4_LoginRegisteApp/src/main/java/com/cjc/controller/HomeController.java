package com.cjc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;
import com.cjc.service.StudentServiceI;

@Controller
public class HomeController 
{
	@Autowired
	StudentServiceI ssi;
	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
	}
	/*@RequestMapping("/login")
	public String Login()
	{
		return "register";
	}*/
	
	@RequestMapping("/registration")
	public String preRegister()
	{
		return "register";
	}
	@RequestMapping("/save")
	public String saveData(@ModelAttribute Student s,Model m)
	{
		ssi.save(s);
		return "login";
	}
	@RequestMapping("/login")
	public String saveStudent(@RequestParam String username,@RequestParam String password,Model m)
	{
		List<Student>l=ssi.saveStudent(username,password);
		if(!l.isEmpty())
		{
			m.addAttribute("data",l);
			return "success";
		}
		else
		{
			m.addAttribute("message","User and Password not match");
			return "login";
		}
	}
		@RequestMapping("/delete")
		public String deleteStudent(@RequestParam String name,Model m)
		{
			List<Student>list=ssi.deleteStudent(name);
			m.addAttribute("data",list);
			return "success";
		}
		@RequestMapping("/edit")
		public String editStudent(@RequestParam int rollno,Model m)
		{
			Student s=ssi.editStudent(rollno);
			m.addAttribute("stu",s);
			return "edit";
			
			
		}
		@RequestMapping("/update")
		public String updateStudent(@ModelAttribute Student s,Model m)
		{
			List<Student>list=ssi.updateStudent(s);
			m.addAttribute("data",list);
			return "success";
			
		}
		@RequestMapping("/paging")
		public String paging(@RequestParam int pageNo,Model m)
		{
			List<Student>list=ssi.paging(pageNo,3);
			m.addAttribute("data",list);
			return "success";
		}
	

		
	}
	


