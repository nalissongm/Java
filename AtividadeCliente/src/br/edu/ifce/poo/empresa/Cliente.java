package br.edu.ifce.poo.empresa;

public class Cliente {
	private NotaFiscal[] listaNotas;
	
	public Cliente(){
		
	}
	
	public Cliente(NotaFiscal[] listaNotas) {
		this.listaNotas = listaNotas;
	}
	
	public double valorTotal() {
		double valorTotal = 0.0;
		for (NotaFiscal nf : listaNotas) {
			valorTotal += nf.valorTotal();
		}
		return valorTotal;
	}
	
	public String imprimir() {
		String nota = "| Nota fiscal\n|\n";
		for (NotaFiscal nf : listaNotas) {
			nota += nf.toString();
		}
		nota += "| Valor a pagar: " + this.valorTotal() + "\n";
		return nota;
	}

	public NotaFiscal[] getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(NotaFiscal[] listaNotas) {
		this.listaNotas = listaNotas;
	}
}
