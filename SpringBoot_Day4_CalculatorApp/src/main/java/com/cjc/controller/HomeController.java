package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String start()
	{
		return "home";
	}
	@RequestMapping("/add")
	public String preAdd()
	{
		System.out.println("addiition");
		return "add";
		
	}
	@RequestMapping("/addition")
	public String saveAdd(@RequestParam int num1,@RequestParam int num2,Model m)
	{
		int result=0;
		result=num1+num2;
		m.addAttribute("data",result);
		System.out.println("addiition result");
		return "result";
		
	}
	@RequestMapping("/sub")
	public String preSub()
	{
		return "sub";
	}
	@RequestMapping("/subtraction")
	public String saveSub(@RequestParam int num1,@RequestParam int num2,Model m)
	{
		int result=0;
		result=num1-num2;
		m.addAttribute("data",result);
		return "result";
		
	}
	@RequestMapping("/mul")
	public String preMul()
	{
		return "mul";
	}
	@RequestMapping("/multiplication")
	public String saveMul(@RequestParam int num1,@RequestParam int num2,Model m)
	{
		int result=0;
		result=num1*num2;
		m.addAttribute("data",result);
		return "result";
		
	}
	@RequestMapping("/div")
	public String preDiv()
	{
		return "div";
	}
	@RequestMapping("/division")
	public String saveDiv(@RequestParam int num1,@RequestParam int num2,Model m)
	{
		int result=0;
		result=num1/num2;
		m.addAttribute("data",result);
		System.out.println("addiition result");
		return "result";
		
	}

}
