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
		String dependentes = "| Dependentes do funcionário:\n";
		
		for(int i = 0; i < this.listaDependentes.length; i++) {
			dependentes+= (i !=  this.listaDependentes.length - 1) ?
					"| " + (i+1)+ " - CPF: " + this.listaDependentes[i].cpfDependente + "\n" :
					"| " + (i+1)+ " - CPF: " + this.listaDependentes[i].cpfDependente;
		}
		
		System.out.println(
				"| Nome: " + this.nome + "\n" +
				"| Código do funcionário: " + this.codMatricula + "\n" +
				"| CPF: " + this.cpf + "\n" +
				"| Telefone: " + this.telefone + "\n" +
				"| Salario: " + this.salario + "\n" +
				"| \n" +
				dependentes
				);

	}
	
	void atualizarTelefone(String telefone)  {
		this.telefone = telefone;
	}
}
