package br.edu.ifce.poo.empresa;

public class Dependente {
	private String cpfDependente;
	
	public Dependente(){
		//System.out.println("Funcionário não possue dependentes");
	}
	
	public Dependente(String cpfDependente){
		this.cpfDependente = cpfDependente;
	}
	
	// Getters e Setters
	public void setCpfDependente(String cpfDependente) {
		this.cpfDependente = cpfDependente;
	}
	
	public String getCpfDependente() {
		return cpfDependente;
	}
}
