package br.edu.ifce.poo.system;

public class ClientePFisica extends Cliente{
	private String cpf;
	
	public ClientePFisica() {
		super();
	}
	
	public ClientePFisica(NotaFiscal[] listaNotas, String cpf) {
		super(listaNotas);
		this.cpf = cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
}
