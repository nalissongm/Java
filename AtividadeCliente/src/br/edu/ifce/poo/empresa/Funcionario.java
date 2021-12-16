package br.edu.ifce.poo.empresa;

public class Funcionario {
	private String nome;
	private String cpf;
	private String telefone;
	private int codMatricula;
	private double salario;
	
	// Informações residenciais
	private Endereco residencia;
	// Lista de dependentes
	private Dependente[] listaDependentes;
	
	private static int id = 0;
	
	/**
	 * Construtor padrão
	 * 	- Gera id autromáticamente
	 * 	- Salário padrão de 1100.00
	 */
	public Funcionario(){
		this.codMatricula = geraId();
		this.salario = 1100.00;
	}
	
	/**
	 * Construtor especial
	 * @param nome
	 * @param cpf
	 * @param telefone
	 * @param codMatricula
	 * @param salario
	 * @param residencia
	 * @param listaDependentes
	 */
	public Funcionario(String nome, String cpf, String telefone, int codMatricula, double salario, Endereco residencia) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.codMatricula = codMatricula;
		this.salario = salario;
		this.residencia = residencia;
	}
	
	
	/**
	 * Método para imprimir dados
	 */
	public void imprimirDados() {
		/*String dependentes = "| Dependentes do funcionário:\n";
		
		for(int i = 0; i < this.listaDependentes.length; i++) {
			dependentes+= (i !=  this.listaDependentes.length - 1) ?
					"| " + (i+1)+ " - CPF: " + this.listaDependentes[i].getCpfDependente() + "\n" :
					"| " + (i+1)+ " - CPF: " + this.listaDependentes[i].getCpfDependente();
		}*/
		
		System.out.println(
				"| Nome: " + this.nome + "\n" +
				"| Código do funcionário: " + this.codMatricula + "\n" +
				"| CPF: " + this.cpf + "\n" +
				"| Telefone: " + this.telefone + "\n" +
				"| Salario: " + this.salario
				//dependentes
				);

	}
	
	/**
	 * Método para atualizar o telefone do funcionário
	 * @param telefone
	 */
	public void atualizarTelefone(String telefone)  {
		this.telefone = telefone;
	}
	
	// Getters e Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone() {
		return telefone;
	}
	
	public void setCodMatricula(int codMatricula) {
		this.codMatricula = codMatricula;
	}
	public int getCodMatricula() {
		 return codMatricula;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	
	public void setEndereco(Endereco residencia) {
		this.residencia = residencia;
	}
	public Endereco getEndereco() {
		return residencia;
	}
	
	public void setDependente(Dependente[] listaDependentes) {
		this.listaDependentes = listaDependentes;
	}
	public Dependente[] getDependente() {
		return listaDependentes;
	}
	
	/**
	 * Cria id incremental
	 * @return int id
	 */
	protected static int geraId() {
		id++;
		return id;
	}
}
