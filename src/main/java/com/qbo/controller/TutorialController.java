package com.qbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.qbo.model.Tutorial;
import com.qbo.service.TutorialService;

@Controller
public class TutorialController {

	@Autowired
	private TutorialService service;

	@GetMapping("/frmListTutorial")
	public String frmListTutorial(Model model) {
		model.addAttribute("listtutoriales", service.listarTutoriales());
		return "frmListTutorial";
	}
	
	@GetMapping("/frmRegTutorial")
	public String frmRegTutorial(Model model) {
		model.addAttribute("tutorial", new Tutorial());
		return "frmRegTutorial";
	}
	
	@PostMapping("/frmRegTutorial")
	public String frmRegTutorial(@ModelAttribute("tutorial") Tutorial objtutorial,
			Model model) {
		service.registrarTutorial(objtutorial);
		model.addAttribute("tutorial", new Tutorial());
		return "frmRegTutorial";
	}
	
	
}
