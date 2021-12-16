package br.edu.ifce.poo.empresa;

public class TeleVendedor extends Vendedor{

	public TeleVendedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeleVendedor(String nome, String cpf, String telefone, int codMatricula, double salario, Endereco residencia,
			double comissao) {
		super(nome, cpf, telefone, codMatricula, salario, residencia, comissao);
	}
	
	public double calcularFrete(String cep) {
		return 10;
	}
}
