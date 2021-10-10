package br.edu.ifce.poo.empresa;

public class Setor {
	String nomeSetor;
	Funcionario[] listaFuncionarios;
	
	Setor(String nomeSetor){
		this.nomeSetor = nomeSetor;
	}

	double calcularFolha() {
		double somaSalario = 0.0;
		for(int i = 0; i < this.listaFuncionarios.length; i++) {
			somaSalario+= this.listaFuncionarios[i].salario;
		}
		return somaSalario;
	}
	
}


























/*public String toString() {
		String print = "";
		for(int i = 0; i < this.listaFuncionarios.length; i++) {
			String setor = "Setor: " + this.nomeSetor + "\n";
			String infoF = "nome do funcionário: " + this.listaFuncionarios[i].nome + "\n" +
					   	   "codMatricula: " + this.listaFuncionarios[i].codMatricula + "\n" +
					   	   "cpf: " + this.listaFuncionarios[i].cpf + "\n" +
					       "telefone: " + this.listaFuncionarios[i].telefone + "\n" +
					       "salário: " + this.listaFuncionarios[i].salario + "\n";
			String residencia = "cep: " + this.listaFuncionarios[i].residencia.cep + "\n" + 
					   		    "logradouro: " + this.listaFuncionarios[i].residencia.logradouro + "\n" +
					   		    "bairro: " + this.listaFuncionarios[i].residencia.bairro + "\n" +
					   		    "número: " + this.listaFuncionarios[i].residencia.numero + "\n";
			String dependentes = "";
			for(int x = 0; x < this.listaFuncionarios[i].listaDependentes.length; x++) {
				dependentes += 
						(x == this.listaFuncionarios[i].listaDependentes.length - 1) ?
						"cpf dependente " + (x + 1) + ": " + this.listaFuncionarios[i].listaDependentes[x].cpfDependente + "\n\n" : 
						"cpf dependente " + (x + 1) + ": " + this.listaFuncionarios[i].listaDependentes[x].cpfDependente + "\n";     
			}
			
			print += setor + infoF + residencia + dependentes;
		}
		return print;
	}*/
