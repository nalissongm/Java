package br.edu.ifce.poo.system;

public class NotaFiscal{
	private ItemComprado[] listaItens;
	
	public NotaFiscal(ItemComprado[] listaItens) {
		this.listaItens = listaItens;
	}
	
	public double valorTotal() {
		double valorTotal = 0.0;
		for (ItemComprado item : listaItens) {
			valorTotal += item.valor();
		}
		return valorTotal;
	}
	
	public String toString() {
		String notaItem = "";
		for (ItemComprado item : listaItens) {
			notaItem += 
					"| Item comprado: " + item.getDescricao() + "\n" +
					"| Preço unitário: R$ " + item.getPreco() + " reais\n" +
					"| Quantidade: " + item.getQuantidade() + "uni \n" +
					"| Valor total: R$ " + item.valor() + " reais\n" +
					"| \n";
					
		}
		return notaItem;
	}
	
	public ItemComprado[] getListaItens() {
		return listaItens;
	}

	public void setListaItens(ItemComprado[] listaItens) {
		this.listaItens = listaItens;
	}
}
