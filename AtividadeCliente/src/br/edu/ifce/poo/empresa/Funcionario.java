package br.edu.ifce.poo.empresa;

public class Funcionario {
	String nome,cpf,telefone;
	int codMatricula;
	double salario;
	
	// Informa��es residenciais
	Endereco residencia;
	// Lista de dependentes
	Dependente[] listaDependentes;
	
	static int id = 0;
	Funcionario(){
		this.codMatricula = geraId();
		this.salario = 1100.00;
	}
	
	void ImprimirDados() {
		String dependentes = "| Dependentes do funcion�rio:\n";
		
		for(int i = 0; i < this.listaDependentes.length; i++) {
			dependentes+= (i !=  this.listaDependentes.length - 1) ?
					"| " + (i+1)+ " - CPF: " + this.listaDependentes[i].cpfDependente + "\n" :
					"| " + (i+1)+ " - CPF: " + this.listaDependentes[i].cpfDependente;
		}
		
		System.out.println(
				"| Nome: " + this.nome + "\n" +
				"| C�digo do funcion�rio: " + this.codMatricula + "\n" +
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
	
	/**
	 * Cria id incremental
	 * @return int id
	 */
	static int geraId() {
		id++;
		return id;
	}
}
