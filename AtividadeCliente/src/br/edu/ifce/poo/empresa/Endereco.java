package br.edu.ifce.poo.empresa;

public class Endereco {
	String logradouro;
	int numero;
	String bairro;
	String cep;
	
	Endereco(){
		this.cep = "63500-000";
	}
	
	Endereco(String logradouro,int numero,String bairro,String cep){
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
	}
	
	void ImprimirDados() {
		System.out.println(
				"| Endereço do funcionário:" + "\n" +
				"| CEP: " + this.cep + "\n" +
				"| Bairro: " + this.bairro + "\n" +
				"| Logradouro: " + this.logradouro + "\n" +
				"| Nº: " + this.numero);
	}
}
