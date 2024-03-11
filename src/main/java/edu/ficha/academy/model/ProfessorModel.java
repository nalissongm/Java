package edu.ficha.academy.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Professor")
public class ProfessorModel {
	@Id
	@Column(name = "matricula_professor")
	private int matricula;
	
	@Column(name = "nome")
	private String nome;
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
}
