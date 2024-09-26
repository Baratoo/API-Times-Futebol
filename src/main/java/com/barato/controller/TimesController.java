package com.barato.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barato.model.entities.Times;
import com.barato.model.repositories.ITimeRepository;

@RestController
@RequestMapping("/times")
public class TimesController {
	
	@Autowired
	private ITimeRepository timesRepository;
	
	private List<Times> times = new ArrayList<>();

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	@PostMapping
	public Times saveTeam(@RequestBody final Times timesModel) {
		return timesRepository.save(timesModel);
	}
	
	//READ - GET
	@GetMapping
	public List<Times> getAll(){
		return times;
	}
	
	
	
	
}
