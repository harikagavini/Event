package com.ManagerDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ManagerDemo.service.VenueListService;

@Controller
public class VenueListController {
	
	@Autowired
	private VenueListService venuelistservice;

	// Handler method to handle students
	@GetMapping("/VenueList")
	public String venulist(Model model) {
		model.addAttribute("Venues", venuelistservice.getAllVenueList());
		return "VenueList";
		
	}
	
	

}
