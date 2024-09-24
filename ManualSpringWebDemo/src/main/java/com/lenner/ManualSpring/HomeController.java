package com.lenner.ManualSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {

		System.out.println("tes123t");
		return "index";
	}
	
	@RequestMapping("add")
//	public String add(HttpServletRequest req, HttpSession session) {
	
	public ModelAndView add(@RequestParam("num1") int n1 ,@RequestParam("num2") int n2,  ModelAndView model) {
//		int num1 = Integer.parseInt(req.getParameter("num1"));
//		int num2 = Integer.parseInt(req.getParameter("num2"));
		int res = n1 + n2;	
//		session.setAttribute("result", res);
//		model.addAttribute("result", res);
		model.setViewName("result");
		model.addObject("result", res);
		System.out.println(res);
		return model;
	}
	
	@RequestMapping("addStudent")
	public String AddStudent() {

		return "addStudent";
	}
	
	@RequestMapping("saveStudent")
	public String SaveStudent(Student student) {
		
		return "result";
	}
	
	@ModelAttribute("testDynamic")
	public String dynamicValue() {
		return "test";
	}
}
