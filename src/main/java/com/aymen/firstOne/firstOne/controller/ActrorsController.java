package com.aymen.firstOne.firstOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aymen.firstOne.firstOne.model.Actor;
import com.aymen.firstOne.firstOne.service.ActorService;

@Controller
public class ActrorsController {
@Autowired
	ActorService actorService;


	@RequestMapping("/actorsList")
	public String displayActors(Model model) {
		model.addAttribute("actors", actorService.getActors());
		return "actorsList";

	}
	
	@RequestMapping(value = "/delete_actor", method = RequestMethod.GET)
	public String handleDeleteUser(@RequestParam(name="name")String name) {
		Actor actor = new Actor();
	    actor = actorService.getActorByName(name);
	    actorService.deleteActor(actor);
	    return "redirect:/actorsList";
	}
	@RequestMapping(value="/addActor")
	public String addActor() {

		return "/addActor";
	}
	
	@RequestMapping(value="/save_actor", method = RequestMethod.GET)
	public String saveActor(@RequestParam(name="name")String name,@RequestParam(name="rate")String rating,Model model) {
		model.addAttribute("name", name);
		model.addAttribute("rate",rating);
		Actor actor= new Actor(name, rating);
		actorService.addActor(actor);
		return "redirect:/actorsList";
	}
}
