package com.barato.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barato.model.entities.Jogadores;

public interface IJogadoresRepository extends JpaRepository<Jogadores, Long>{

	List<Jogadores> findByNomeContaining(String nome);
	
	List<Jogadores> findByTimes(Long id);
}
