package br.edu.ifce.poo.empresa;

public class Endereco {
	String logradouro;
	int numero;
	String bairro;
	String cep;
	
	void ImprimirDados() {
		System.out.println(
				"| Endere�o do funcion�rio:" + "\n" +
				"| CEP: " + this.cep + "\n" +
				"| Bairro: " + this.bairro + "\n" +
				"| Logradouro: " + this.logradouro + "\n" +
				"| N�: " + this.numero);
	}
}
