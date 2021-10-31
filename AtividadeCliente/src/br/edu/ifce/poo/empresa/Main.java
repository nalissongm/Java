package br.edu.ifce.poo.empresa;
/**
 * 
 * @author nalisson
 *
 */

public class Main {
	public static void main(String[] args) {
	/*-------------------------------------------------------------
	 |	Criando funcionário - 01
	 |-------------------------------------------------------------
	 */
		Funcionario f1 = new Funcionario();
		
		// Informações do funcionário
		f1.setNome("Sérgio Iago da Rosa");
		f1.setCpf("377.176.852-72");
		f1.setTelefone("(88) 98663-7885");
		f1.setSalario(2530.00);
		
		// Informações residenciais 
		f1.setEndereco(new Endereco(
				"Rua Antônio Serudo Martins",
				980,
				"Jauari I",
				"63508-430"
				));
		
		// Dependentes do funcionário
		Dependente d1_f1 = new Dependente("677.676.390-96");
		Dependente d2_f1 = new Dependente("283.918.270-03");
		
		f1.setDependente(new Dependente[]{d1_f1,d2_f1});
		
		
	/*---------------------------------------------------------------
	 |	Criando funcionário - 02
	 |---------------------------------------------------------------
	*/
		Funcionario f2 = new Funcionario();
		
		// Informações do funcionário
		f2.setNome("Emily Luciana Lorena da Cunha");
		f2.setCpf("481.736.510-27");
		f2.setTelefone("(68) 98630-5643");
		
		// Informações residenciais
		f2.setEndereco(new Endereco("Travessa Batista", 549, "Educandos", "69070-350"));
		
		// Dependentes do funcionário
		Dependente d1_f2 = new Dependente("503.176.420-14");
		Dependente d2_f2 = new Dependente("807.325.360-73");		
		Dependente d3_f2 = new Dependente("490.553.340-65");
		
		
		f2.setDependente(new Dependente[]{d1_f2,d2_f2,d3_f2});
		
	/*---------------------------------------------------------------
	 |	Criando setor e atribuindo funcionários
	 |---------------------------------------------------------------
	*/
		
		Setor s1 = new Setor();
		
		// Nome do setor
		s1.setNomeSetor("Gestão");
		
		// Atribuição dos funcionários no setor
		s1.setListaFuncionarios(new Funcionario[]{f1,f2});
	
		
	/**
	 * Executando alterações
	 */
		// Alterando o telefone de funcionário 01
		f1.atualizarTelefone("(92) 98201-6270");
		
		
	/**
	 * Exibindo informações
	 */
		
		System.out.println(
				"/--------------------------------------\n" +
				"| Setor - " + s1.getNomeSetor() + "\n" + 
				"|--------------------------------------\n" +
				"| \n" +
				"| > Funcionário 01: \n" +
				"|"
				);
		s1.getListaFuncionarios()[0].ImprimirDados();
		System.out.println(
				"|"
				);
		s1.getListaFuncionarios()[0].getEndereco().ImprimirDados();
		System.out.println(
				"| \n" +
				"| > Funcionário 02:\n" +
				"|"
				);
		s1.getListaFuncionarios()[1].ImprimirDados();
		System.out.println(
				"|"
				);
		s1.getListaFuncionarios()[1].getEndereco().ImprimirDados();
		System.out.println(
				"|-----------------------------------------\n"+
				"| SOMA TOTAL - SALÁRIOS: R$" + String.format("%.02f",s1.calcularFolha()) + "\n" +
				"\\----------------------------------------"
				);
	}
}