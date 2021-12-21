package br.edu.ifce.poo.empresa;

public class ItemComprado{
	private String descricao;
	private double preco;
	private int quantidade;
	
	public ItemComprado(){
		System.out.println("Novo item comprado");
	};
	
	public ItemComprado(String descricao,double preco,int quantidade){
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
	
	public String toString() {
		String text = "";
		text += " Descrição do item: " + getDescricao() + ";\n";
		text += " Preço do item: " + getPreco() + ";\n";
		text += " Quantidade: " + getQuantidade() + ";\n";
		text += " Valor total: " + valor() + ";\n";
		return text;
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
