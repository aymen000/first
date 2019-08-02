package com.aymen.firstOne.firstOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aymen.firstOne.firstOne.service.ActorService;

@Controller
public class IndexController {
@Autowired
	private ActorService actorService;
	
	
	public IndexController(ActorService actorService) {
		super();
		this.actorService = actorService;
	}


	@RequestMapping("/")
	public String index(Model model) {
		
		return "index";
	}
}
