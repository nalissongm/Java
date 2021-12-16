package br.edu.ifce.poo.empresa;

public class ClientePJuridica extends Cliente{
	private String cnpj;
	
	public ClientePJuridica() {
		super();
	}
	
	public ClientePJuridica(NotaFiscal[] listaNotas, String cnpj) {
		super(listaNotas);
		this.cnpj = cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
}
