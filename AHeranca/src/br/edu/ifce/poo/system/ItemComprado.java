package br.edu.ifce.poo.system;

public class ItemComprado{
	private String descricao;
	private double preco;
	private int quantidade;
	
	ItemComprado(){
		System.out.println("Novo item comprado");
	};
	
	ItemComprado(String descricao,double preco,int quantidade){
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	};
	
	/**
	 * Retorna valor total do item comprado
	 * @return
	 */
	public double valor() {
		double valor = this.quantidade * this.preco;
		return valor;
	}
	
	/*----------------------------------------------
	 | Métodos Getters e Setters
	 |----------------------------------------------
	*/
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
}
