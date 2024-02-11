package edu.ficha.academy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Professor")
public class ProfessorModel {
	@Id
	@Column
	private int id;
	@Column
	private String nome;
	@Column
	private int cref;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCref() {
		return cref;
	}
	public void setCref(int cref) {
		this.cref = cref;
	}
	
	
	
}
