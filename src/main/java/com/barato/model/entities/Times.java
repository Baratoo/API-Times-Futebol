package com.barato.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Times {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private String pais;
	private int anoFundacao;
	//private List<Jogador> jogadores;
	
	public Times() {
		// TODO Auto-generated constructor stub
	}

	public Times(Long id, String nome, String pais, int anoFundacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.pais = pais;
		this.anoFundacao = anoFundacao;
	}

	public Times(String nome, String pais, int anoFundacao) {
		super();
		this.nome = nome;
		this.pais = pais;
		this.anoFundacao = anoFundacao;
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
	
	
	
	
}
