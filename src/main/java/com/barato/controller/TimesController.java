package com.barato.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.barato.model.entities.Times;
import com.barato.model.repositories.ITimeRepository;

@RestController
@RequestMapping("/times")
public class TimesController {
	
	@Autowired
	private ITimeRepository timesRepository;

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	@PostMapping()
	public @ResponseBody Times saveTeam(@RequestBody final Times time) { //Responsebody transforma em JSON e Requestbody manupula o Objeto do Java
		timesRepository.save(time);
		return time;
	}
	
	//READ - GET
	@GetMapping
	public List<Times> getAll(){
		return timesRepository.findAll();
	}
	
	//READ ID - GET
	@GetMapping("/{id}")
	public Optional<Times> findById(@PathVariable long id) {
		return timesRepository.findById(id);
	}
	
	@GetMapping("/buscar/{nome}")
	public List<Times> findByNomeContaining(@PathVariable String nome){
		return timesRepository.findByNomeContaining(nome);
	}
	
	@GetMapping("/country/{country}") //FUNÇÃO DECLARADA NA INTERFACE
	public List<Times> findByCountry(@PathVariable String country){
		return timesRepository.findByPais(country);
	}
	
	@PutMapping("/{id}")
	public @ResponseBody Times updateTeam(@PathVariable Long id,@RequestBody Times update) {

		Optional<Times> idUpdate = timesRepository.findById(id);
		
		Times timeExistente = idUpdate.get();
		
		timeExistente.setNome(update.getNome()); 
		timeExistente.setPais(update.getPais());
		timeExistente.setAnoFundacao(update.getAnoFundacao());
		timeExistente.setJogadores(update.getJogadores());
		
		timesRepository.save(timeExistente);
		return timeExistente;
	}
	
	@DeleteMapping("{id}")
	public void deleteTeam (@PathVariable Long id) {
		timesRepository.deleteById(id);
	}
	
	
	
	
	
	
	
}
