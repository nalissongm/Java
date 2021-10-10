package br.edu.ifce.poo.empresa;

public class Funcionario {
	String nome,cpf,telefone;
	int codMatricula;
	double salario;
	
	// Informações residenciais
	Endereco residencia;
	// Lista de dependentes
	Dependente[] listaDependentes;
	
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
				"Salario: " + this.salario + "\n" +
				dependentes + "\n"
				);

	}
	
	void atualizarTelefone(String telefone)  {
		this.telefone = telefone;
	}
}
