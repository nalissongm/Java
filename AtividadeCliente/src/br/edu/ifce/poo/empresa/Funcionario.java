package br.edu.ifce.poo.empresa;

public class Funcionario {
	String nome,cpf,telefone;
	int codMatricula;
	double salario;
	Endereco residencia;
	Dependente[] listaDependentes;
	
	Funcionario(String nome, int codMatricula, String cpf, String telefone, double salario){
		this.nome = nome;
		this.codMatricula = codMatricula;
		this.cpf = cpf;
		this.telefone = telefone;
		this.salario = salario;
	}
	
	void ImprimirDados() {
		String dependentes = "";
		for(int i = 0; i < this.listaDependentes.length; i++) {
			dependentes+="Dependente " +(i+1)+ ": " + this.listaDependentes[i].cpfDependente + "\n";
		}
		System.out.println(
				"Nome: " + this.nome + "\n" +
				"Código do funcionário: " + this.codMatricula + "\n" +
				"CPF: " + this.cpf + "\n" +
				"Telefone: " + this.telefone + "\n" +
				"Salario: " + this.salario + "\n"
				);
		this.residencia.ImprimirDados();
		System.out.println("\n" + dependentes);
	}
	
	void atualizarTelefone(String telefone)  {
		this.telefone = telefone;
	}
}
