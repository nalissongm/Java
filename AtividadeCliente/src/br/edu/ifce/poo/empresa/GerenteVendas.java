package br.edu.ifce.poo.empresa;

public class GerenteVendas extends Vendedor {
	private String senha;
	
	public GerenteVendas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GerenteVendas(
			String nome,
			String cpf,
			String telefone,
			int codMatricula,
			double salario,
			Endereco residencia,
			double comissao,
			String senha) {	
		super(nome, cpf, telefone, codMatricula, salario, residencia, comissao);
		this.senha = senha;
	}
	
	public void realizarEstorno(NotaFiscal venda, String senha) {
		if(senha.equals(this.senha)) {
			System.out.println("Venda de valor R$ " + venda.valorTotal() + " foi estornado.");
		}else {
			System.out.println("Senha Inválida.");
		}
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
