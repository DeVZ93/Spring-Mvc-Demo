package com.dominik.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public ResponseEntity welcome() {
		List<String> welcomeMessage = new ArrayList<>();
		welcomeMessage.add("Hi");
		welcomeMessage.add("Strong man");
		
		Table table = new Table();
		table.setName("stol");
		table.setSurname("stolowy");
		
		return new ResponseEntity(table, HttpStatus.OK);
	}
	
}
