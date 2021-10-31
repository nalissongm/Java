package br.edu.ifce.poo.empresa;

public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String cep;
	
	public Endereco(){
		this.cep = "63500-000";
	}
	
	public Endereco(String logradouro, int numero, String bairro, String cep){
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
	}

	
	public void ImprimirDados() {
		System.out.println(
				"| Endereço do funcionário:" + "\n" +
				"| CEP: " + this.cep + "\n" +
				"| Bairro: " + this.bairro + "\n" +
				"| Logradouro: " + this.logradouro + "\n" +
				"| Nº: " + this.numero);
	}
	
	// Getters e Setters
	public void setLogradouro(String logradouro){
		this.logradouro = logradouro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	
	public void setBairro(String bairro){
		this.bairro = bairro;
	}
	public String getBairro() {
		return bairro;
	}
	
	public void setCep(String cep){
		this.cep = cep;
	}
	public String getCep() {
		return cep;
	}
}
