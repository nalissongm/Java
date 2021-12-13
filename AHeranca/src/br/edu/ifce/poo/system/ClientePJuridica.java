package br.edu.ifce.poo.system;

public class ClientePJuridica extends Cliente{
	@SuppressWarnings("unused")
	private String cnpj;
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
}
