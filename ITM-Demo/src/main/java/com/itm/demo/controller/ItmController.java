package com.itm.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.itm.demo.service.ItmServiceInterface;

import lombok.extern.slf4j.Slf4j;

//@RestController

@Controller
@Slf4j // For debugging
public class ItmController {

	
	@Autowired
	ItmServiceInterface itemService;
	// Logger logger = LoggerFactory.getLogger(ItmController.class);

	@GetMapping("/index")
	public String getHome(Model mav) {
		
		

		log.info("Request received in getHome()");
		mav.addAttribute("For1","Welcome to ITM Systems");
		mav.addAttribute("itm",itemService.getStudents());
		return "index";
	}

}
