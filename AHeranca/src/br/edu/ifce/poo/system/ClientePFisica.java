package br.edu.ifce.poo.system;

public class ClientePFisica extends Cliente{
	@SuppressWarnings("unused")
	private String cpf;
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
}
