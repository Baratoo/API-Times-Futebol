package com.barato.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Times {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String pais;
	private int anoFundação;
	//private List<Jogador> jogadores;
	
	public Times() {
		// TODO Auto-generated constructor stub
	}
	public Times(Long id, String nome, String pais, int anoFundação) {
		super();
		this.id = id;
		this.nome = nome;
		this.pais = pais;
		this.anoFundação = anoFundação;
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
	public int getAnoFundação() {
		return anoFundação;
	}
	public void setAnoFundação(int anoFundação) {
		this.anoFundação = anoFundação;
	}
	@Override
	public String toString() {
		return "TimesModel [id=" + id + ", nome=" + nome + ", pais=" + pais + ", anoFundação=" + anoFundação + "]";
	}
	
	
}
