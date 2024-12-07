package com.klef.exam.jfsd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@CrossOrigin
public class CLientController {
	
	//1
	@GetMapping("/greet")
	public String greet(@RequestParam("username") String uname,Model m) {
		m.addAttribute("message","Welcome "+uname);
		return "greet.jsp";
	}
	
	//2
	@GetMapping("/about")
	public String about() {
		return "about.jsp";
	}
	
	//3
	@GetMapping("/demo1")
	public String demo1(@RequestParam("age") int age, @RequestParam("country") String country,Model m) {
		m.addAttribute("message", "Age: "+age+"Country: "+country);
		return "demo1.jsp";
	}
	
	//4
	@GetMapping("/demo2/{num1}/{num2}")
	public String demo2(@PathVariable int num1,@PathVariable int num2,Model m) {
		int sub = num1-num2;
		int div = num1/num2;
		m.addAttribute("message","Subraction: "+sub+"Division: "+div);
		return "demo2.jsp";
	}
	
	//5
	@GetMapping("/productform")
	public String productform() {
		return "productform.jsp";
	}
	
	//6
	@GetMapping("/multiplynumbers")
	public String multiplyNumbers(@RequestParam("num1") int num1,@RequestParam("num2") int num2,Model m) {
		int mul = num1*num2;
		m.addAttribute("message","Multiplication: "+mul);
		return "multiply.jsp";
	}
	
	//7
	@GetMapping("/reverse")
	public String reverse(@RequestParam("str1") String str1,@RequestParam("str2") String str2,Model m) {
		
		StringBuilder s1 = new StringBuilder(str1);
		StringBuilder s2 = new StringBuilder(str2);
		m.addAttribute("message","reversed String: "+s1.reverse().toString()+s2.reverse().toString());
		return "reverse.jsp";
	}
	
	//8
	@GetMapping("/calculate")
	public String calculate(@RequestParam("num1") int num1,@RequestParam("num2") int num2,Model m) {
		int sub = num1-num2;
		int add = num1+num2;
		m.addAttribute("message","Subraction: "+sub+"Addition: "+add);
		return "calculate.jsp";
	}
}
