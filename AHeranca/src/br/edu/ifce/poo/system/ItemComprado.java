package br.edu.ifce.poo.system;

public class ItemComprado extends Cliente{
	@SuppressWarnings("unused")
	private String descricao;
	@SuppressWarnings("unused")
	private double preco;
	@SuppressWarnings("unused")
	private int quantidade;
	
	@SuppressWarnings("unused")
	private ItemComprado[] listaItens;
	
	/**
	 * 
	 * @return
	 */
	public double valor() {
		double valor = this.quantidade * this.preco;
		return valor;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao(String descricao) {
		return this.descricao;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco(double preco) {
		return this.preco;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade(int quantidade) {
		return this.quantidade;
	}
}
