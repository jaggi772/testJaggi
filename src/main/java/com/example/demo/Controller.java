package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PersonService;

@RestController
public class Controller {

	@Autowired
	Pojo pojo;
	
	@Autowired
	PojoService pojoService;
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/")
	public String test() {
		personService.createPerson("jaggi");
		return pojo.toString();
	}
	
}
