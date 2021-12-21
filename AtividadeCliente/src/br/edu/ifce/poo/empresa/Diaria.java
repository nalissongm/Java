package br.edu.ifce.poo.empresa;

public class Diaria {
	private String descricao;
	private double valor;
	
	/**
	 * @param descricao
	 * @param valor
	 */
	public Diaria(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Diaria() {
	}
	
	public String toSting() {
		String text = "";
		text += "Descri��o da di�ria: " + getDescricao() + ";\n";
		text += "Valor da di�ria: " + getValor() + ";\n";
		return text;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}

}
