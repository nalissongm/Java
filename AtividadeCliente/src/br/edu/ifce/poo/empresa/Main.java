package br.edu.ifce.poo.empresa;
/**
 * 
 * @author nalisson
 *
 */

public class Main {
	static int id = 0;
	public static void main(String[] args, Funcionario[][] Funcionario) {
	/*-------------------------------------------------------------
	 |	Criando funcionário - 01
	 |-------------------------------------------------------------
	 */
		Funcionario f1 = new Funcionario();
		
		// Informações do funcionário
		f1.nome = "Sérgio Iago da Rosa";
		f1.codMatricula = geraId();
		f1.cpf = "377.176.852-72";
		f1.telefone = "(92) 98201-6270";
		f1.salario = 2530.00;
		
		// Informações residenciais
		f1.residencia = new Endereco();
		f1.residencia.logradouro = "Rua Antônio Serudo Martins";
		f1.residencia.numero = 980;
		f1.residencia.bairro = "Jauari I";
		f1.residencia.cep = "69104-112";
		
		// Dependentes do funcionário
		Dependente d1_f1 = new Dependente();
		d1_f1.cpfDependente = "677.676.390-96";
		
		Dependente d2_f1 = new Dependente();
		d2_f1.cpfDependente = "283.918.270-03";
		
		f1.listaDependentes = new Dependente[2];
		f1.listaDependentes[0] = d1_f1;
		f1.listaDependentes[1] = d2_f1;
		
		
	/*---------------------------------------------------------------
	 |	Criando funcionário - 02
	 |---------------------------------------------------------------
	*/
		Funcionario f2 = new Funcionario();
		
		// Informações do funcionário
		f2.nome = "Emily Luciana Lorena da Cunha";
		f2.codMatricula = geraId();
		f2.cpf = "481.736.510-27";
		f2.telefone = "(68) 98630-5643";
		f2.salario = 2530.00;
		
		// Informações residenciais
		f2.residencia = new Endereco();
		
		f2.residencia.logradouro = "Travessa Batista";
		f2.residencia.numero = 549;
		f2.residencia.bairro = "Educandos";
		f2.residencia.cep = "69070-350";
		
		// Dependentes do funcionário
		Dependente d1_f2 = new Dependente();
		d1_f2.cpfDependente = "503.176.420-14";
		
		Dependente d2_f2 = new Dependente();
		d2_f2.cpfDependente = "807.325.360-73";
		
		Dependente d3_f2 = new Dependente();
		d3_f2.cpfDependente = "490.553.340-65";
		
		
		f2.listaDependentes = new Dependente[3];
		f2.listaDependentes[0] = d1_f2;
		f2.listaDependentes[1] = d2_f2;
		f2.listaDependentes[2] = d3_f2;
		
	/*---------------------------------------------------------------
	 |	Criando setor e atribuindo funcionários
	 |---------------------------------------------------------------
	*/
		
		Setor s1 = new Setor();
		
		// Nome do setor
		s1.nomeSetor = "Gestão";
		
		// Atribuição dos funcionários no setor
		s1.listaFuncionarios = new Funcionario[2];
		s1.listaFuncionarios[0] = f1;
		s1.listaFuncionarios[1] = f2;
	
	/**
	 * Executando códigos
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