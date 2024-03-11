package edu.ficha.academy.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class AlunoModel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "matricula")
	private Integer matricula;
	
	@Column(name = "curso")
	private String curso;
	
	@Column(name = "instituicao")
	private String instituicao;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "idade")
	private int idade;

	@Column(name = "peso")
	private double peso;
	
	@Column(name = "altura")
	private double altura;
	
	
	@Column(name = "matricula_professor_fk")
	private int matriculaProfessorFk;
	

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getMatriculaProfessorFk() {
		return matriculaProfessorFk;
	}
	
	public void setMatriculaProfessorFk(int matriculaProfessorFk) {
		this.matriculaProfessorFk = matriculaProfessorFk;
	}

	
	
	
	
	
	
	
}
