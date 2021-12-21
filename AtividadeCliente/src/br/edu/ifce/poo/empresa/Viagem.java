package br.edu.ifce.poo.empresa;

public class Viagem {
	private int codFuncionario;
	private Diaria[] listaDiarias;
	

	/**
	 * @param codFuncionario
	 * @param listaDiarias
	 */
	public Viagem(int codFuncionario, Diaria[] listaDiarias) {
		this.codFuncionario = codFuncionario;
		this.listaDiarias = listaDiarias;
	}
	
	public Viagem() {
	}
	
	public double valorTotal(){
		double total = 0.0;
		if(this.listaDiarias != null) {
			for (Diaria diaria : listaDiarias) {
				total += diaria.getValor();
			}
		}
		return total;
	}
	
	public String toString() {
		String text = "";
		text += "Código do funcionário: " + getCodFuncionario() + ";";
		text += "Diárias: " + "[ \n";
		for (Diaria diaria : listaDiarias) {
			text += diaria + "\n";
 		}
		text += "];\n";
		text += "Valor total: " + valorTotal() + ";";
		return text;
	}
	
	public int getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

	public Diaria[] getListaDiarias() {
		return listaDiarias;
	}

	public void setListaDiarias(Diaria[] listaDiarias) {
		this.listaDiarias = listaDiarias;
	}
	
	
}
