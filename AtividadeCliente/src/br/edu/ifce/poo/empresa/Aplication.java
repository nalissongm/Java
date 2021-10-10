package br.edu.ifce.poo.empresa;
/**
 * 
 * @author nalisson
 *
 */

public class Aplication {
	static int id = 0;
	public static void main(String[] args, Funcionario[][] Funcionario) {
	/**
	 * Criando o funcionário 01
	 */
		Funcionario f1 = new Funcionario("Sérgio Iago da Rosa",geraId(),"377.176.852-72","(92) 98201-6270",2530.00);
		
		// Informações residenciais
		f1.residencia = new Endereco("Rua Antônio Serudo Martins",980,"Jauari I","69104-112");
		
		// Dependentes
		Dependente d1_f1 = new Dependente("677.676.390-96");
		
		Dependente d2_f1 = new Dependente("283.918.270-03");
		
		f1.listaDependentes = new Dependente[2];
		f1.listaDependentes[0] = d1_f1;
		f1.listaDependentes[1] = d2_f1;
		
	/**
	 * Criando o funcionário 02
	 */
		Funcionario f2 = new Funcionario("Emily Luciana Lorena da Cunha",geraId(),"481.736.510-27","(68) 98630-5643",2530.00);
		
		// Informações residenciais
		f2.residencia = new Endereco("Travessa Batista",549,"Educandos","69070-350");
		
		// Dependentes
		Dependente d1_f2 = new Dependente("503.176.420-14");
		
		Dependente d2_f2 = new Dependente("807.325.360-73");
		
		Dependente d3_f2 = new Dependente("490.553.340-65");
		
		Dependente d4_f2 = new Dependente("239.576.120-63");
		
		f2.listaDependentes = new Dependente[4];
		f2.listaDependentes[0] = d1_f2;
		f2.listaDependentes[1] = d2_f2;
		f2.listaDependentes[2] = d3_f2;
		f2.listaDependentes[3] = d4_f2;
		
	/**
	 * Criando setor e atribuindo funcionários
	 */
		Setor s1 = new Setor("Gestor");
		s1.listaFuncionarios = new Funcionario[2];
		s1.listaFuncionarios[0] = f1;
		s1.listaFuncionarios[1] = f2;
	
	/**
	 * Print dos funcionários no Setor
	 */
		
		
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