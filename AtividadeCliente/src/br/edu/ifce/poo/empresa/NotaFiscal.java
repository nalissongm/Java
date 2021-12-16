package br.edu.ifce.poo.empresa;

public class NotaFiscal {
	private String cpfCliente;
	private ItemComprado[] listaItens;
	public NotaFiscal() {
		
	}
	
	public NotaFiscal(String cpfCliente, ItemComprado[] listaItens) {
		this.cpfCliente = cpfCliente;
		this.listaItens = listaItens;
	}
	
	public double valorTotal() {
		double total = 0;
		for (ItemComprado item : listaItens) {
			total += item.valor();
		}
		return total;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public ItemComprado[] getListaItens() {
		return listaItens;
	}

	public void setListaItens(ItemComprado[] listaItens) {
		this.listaItens = listaItens;
	}
	
}
