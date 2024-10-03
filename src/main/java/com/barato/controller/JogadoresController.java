package com.barato.controller;

import java.util.Iterator;
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

import com.barato.model.entities.Jogadores;
import com.barato.model.entities.Times;
import com.barato.model.repositories.IJogadoresRepository;
import com.barato.model.repositories.ITimeRepository;

@RestController
@RequestMapping("/jogadores")
public class JogadoresController {

	@Autowired
	private IJogadoresRepository jogadoresRepository;
	
	@Autowired
	private ITimeRepository timesRepository;
	
	@GetMapping("/hello")
	public String hello() {
		return "ola";
	}
	
	@PostMapping
	public @ResponseBody Jogadores saveJogador(@RequestBody Jogadores jo) {
		
		Optional<Times> idUpdate = timesRepository.findById(jo.getTime().getId());
		
		Times time = idUpdate.get();
		
		jo.setTime(time);		
		return jogadoresRepository.save(jo);
	}
	
	@PostMapping("/all")
	public @ResponseBody List<Jogadores> saveAllJogadores(@RequestBody List<Jogadores> jo){
		for(Jogadores j : jo) {
			Optional<Times> idUpdate = timesRepository.findById(j.getTime().getId());
			Times time = idUpdate.get();
			j.setTime(time);
		}
		
		return jogadoresRepository.saveAll(jo);
	}
	
	@GetMapping
	public List<Jogadores> getAll(){
		return jogadoresRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Jogadores> findById(@PathVariable Long id){
		return jogadoresRepository.findById(id);
	}
	
	@GetMapping("/buscar/{nome}")
	public List<Jogadores> findByName(@PathVariable String nome) {
		return jogadoresRepository.findByNomeContaining(nome);
	}
	
	@GetMapping("/time/{id}")
	public List<Jogadores> findByTime(@PathVariable Long id){
		
		Optional<Times> time = timesRepository.findById(id);
	
		return jogadoresRepository.findByTime(time.get());
	}
	
	@GetMapping("/camisa/{num}")
	public List<Jogadores> findByNumeroCamisa(@PathVariable int num){	
		return jogadoresRepository.findByNumeroCamisa(num);
	}
	
	@PutMapping("/{id}")
	public @ResponseBody Jogadores updateJogador(@PathVariable Long id,@RequestBody Jogadores jog) {
		
		Optional<Jogadores> idUpdate = jogadoresRepository.findById(id);
		
		Jogadores jogExistente = idUpdate.get();
		
		jogExistente.setNome(jog.getNome());
		jogExistente.setNumeroCamisa(jog.getNumeroCamisa());
		jogExistente.setPosicao(jog.getPosicao());
		jogExistente.setTime(jog.getTime());
		
		jogadoresRepository.save(jogExistente);
		return jogExistente;
	}
	
	@DeleteMapping("/{id}")
	public void deleteJogador(@PathVariable Long id) {
		jogadoresRepository.deleteById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
