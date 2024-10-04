package com.barato.model.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Times {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String pais;
	private int anoFundacao;
	
	@OneToMany(mappedBy = "time")//Mapeando onde está relacionado em Jogadores
	private List<Jogadores> jogadores;
	
	public Times() {
	}

	public Times(Long id, String nome, String pais, int anoFundacao, List<Jogadores> jogadores) {
		super();
		this.id = id;
		this.nome = nome;
		this.pais = pais;
		this.anoFundacao = anoFundacao;
		this.jogadores = jogadores;
	}

	public Times(String nome, String pais, int anoFundacao, List<Jogadores> jogadores) {
		super();
		this.nome = nome;
		this.pais = pais;
		this.anoFundacao = anoFundacao;
		this.jogadores = jogadores;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}

	public List<Jogadores> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogadores> jogadores) {
		this.jogadores = jogadores;
	}
	
	
	
	
}
