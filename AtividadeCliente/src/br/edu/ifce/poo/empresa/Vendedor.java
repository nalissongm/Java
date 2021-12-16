package br.edu.ifce.poo.empresa;

public class Vendedor extends Funcionario {
	private double comissao;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(
			String nome,
			String cpf,
			String telefone,
			int codMatricula, 
			double salario,
			Endereco residencia,
			double comissao) {
		super(nome, cpf, telefone, codMatricula, salario, residencia);
		this.comissao = comissao;
	}
	
	public void realizarVenda(NotaFiscal venda) {
		comissao += (0.01 * venda.valorTotal());
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("| Comissao: " + this.getComissao());
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() + this.comissao;
	}
}
