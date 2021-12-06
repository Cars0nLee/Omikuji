package com.cl.omikuji;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmiController {
	@RequestMapping("/form")
	public String form() {
		return "form.jsp";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(
			@RequestParam(value="number") Integer number, 
			@RequestParam(value="city") String city, 
			@RequestParam(value="name") String name,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="pet") String pet,
			@RequestParam(value="comment") String comment,
			HttpSession session) {
		String omikuji = "In " + number + " years, you will live in " + city + " with " + name + " as your roommate, " + hobby + " for a living. " + "The next time you see a " + pet + " you will have a good luck. " + "Also " + comment;
		session.setAttribute("omikuji", omikuji);
		return "redirect:/display";
	}
	
	@RequestMapping("/display")
	public String display(HttpSession session, Model model) {
		String fortune = (String) session.getAttribute("omikuji");
		model.addAttribute("fortune", fortune);
		return "display.jsp";
	}
}
