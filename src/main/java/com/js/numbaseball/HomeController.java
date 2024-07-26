package com.js.numbaseball;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Home page");
		return "redirect:numbaseball";
	}
	
	@RequestMapping("/numbaseball")
	public String numbaseball(HttpServletRequest request, Model model) {
		logger.info("HomeController 클래스의 numbaseball() 메소드 실행");
		return "numbaseball";
	}
}
