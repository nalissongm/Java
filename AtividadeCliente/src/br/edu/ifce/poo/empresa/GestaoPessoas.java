package br.edu.ifce.poo.empresa;

import java.util.ArrayList;
import java.util.List;

public class GestaoPessoas {
	private List<Funcionario> listaFuncionarios;
	
	public GestaoPessoas() {
		listaFuncionarios = new ArrayList<Funcionario>();
	}

	public void addFuncionario(Funcionario f) {
		listaFuncionarios.add(f);
	}
	
	public double calcSalarioTotal() {
		double total = 0;
		for(Funcionario f: listaFuncionarios) {
			total += f.getSalario();
		};
		return total;
	}
}
