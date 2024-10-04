package com.barato.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Jogadores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_j")
	private Long id;
	
	@Column(name = "nome_j")
	private String nome; 

	@Column(name = "numero_camisa")  
	private int numeroCamisa;
	
	private String posicao; 
	
	@ManyToOne
	@JoinColumn(name = "time_id")
	@JsonBackReference
	private Times time;
	
	public Jogadores() {
		// TODO Auto-generated constructor stub
	}

	public Jogadores(Long id, String nome, int numeroCamisa, String posicao, Times time) {
		super();
		this.id = id;
		this.nome = nome;
		this.numeroCamisa = numeroCamisa;
		this.posicao = posicao;
		this.time = time;
	}

	public Jogadores(String nome, int numeroCamisa, String posicao, Times time) {
		super();
		this.nome = nome;
		this.numeroCamisa = numeroCamisa;
		this.posicao = posicao;
		this.time = time;
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

	public int getNumeroCamisa() {
		return numeroCamisa;
	}

	public void setNumeroCamisa(int numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Times getTime() {
		return time;
	}

	public void setTime(Times time) {
		this.time = time;
	}
	
	
	
}
