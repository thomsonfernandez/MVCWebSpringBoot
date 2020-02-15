package com.webtest.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webtest.flights.Flight;

@Controller
public class HomeController {
	
//	localhost:8080/home
	
	/*
	 * @RequestMapping("home") public String myMethod(HttpServletRequest request) {
	 * HttpSession session = request.getSession(); String name =
	 * request.getParameter("name"); session.setAttribute("name", name);
	 * System.out.println("Inside spring home controller!!"); return "home"; }
	 */
	
	/*
	 * @RequestMapping("home") public String myMethod(@RequestParam("name") String
	 * myName, HttpSession session) { session.setAttribute("name", myName);
	 * System.out.println("Inside spring home controller!!"); return "home"; }
	 */
	
	@RequestMapping("home")
	public ModelAndView myMethod(Flight flight) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",flight);
		mv.setViewName("home");
		//changes are added
		return mv;
	}

}
