package com.jbk.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
@RequestMapping("/")
public String loginpage() {
	return "login";
}

	
}
