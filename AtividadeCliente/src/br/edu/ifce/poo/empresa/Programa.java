package br.edu.ifce.poo.empresa;

public class Programa {

	public static void main(String[] args) {	
	/*---------------------------------------------------------------
	 | 01 => Criando funcionários
	 |---------------------------------------------------------------
	*/
		Funcionario f00 = new Funcionario("Frank","000.000.000-00","(00) 90000-0000",1,2400.00,
				new Endereco("Rua Antonieta",1,"Bairro Flores","63000-000"));
		
		Vendedor v00 = new Vendedor("Jane Doe","111.111.111-11","(11) 91111-1111",1,2800.00,
				new Endereco("Rua João Guedes",1,"Bairro Areias Park","63111-111"),0.0);
		
		GerenteVendas gv00 = new GerenteVendas("Carlos Felipe", "222.222.222-22","(22) 92222-2222",2,2800.00,
				new Endereco("Rua Ameida Ferreira", 2, "Bairro Flores", "63222-222"),0.0,"abc123");
		
		
		TeleVendedor tv00 = new TeleVendedor("Bruna Gonsalves", "333.333.333-33","(33) 93333-3333",3,2000.00,
				new Endereco("Rua Padroeiro", 3, "Bairro Sete de Setembro", "63333-333"),0.0);
		
		Vendedor v01 = new Vendedor("John Doe","444.444.444-44","(44) 94444-4444",4,2800.00,
				new Endereco("Rua Alzira Bezerra",4,"Bairro Cajueiro","63444-444"),0.0);
		
	/*---------------------------------------------------------------
	 | 02 => Polimorfismo (Funcionario = Vendedor)
	 |---------------------------------------------------------------
	*/
		Funcionario f01 = v00;
		Funcionario f02 = v01;
		Funcionario f03 = gv00;
		Funcionario f04 = tv00;
		
	/*---------------------------------------------------------------
	 | 03 => Efetuando vendas
	 |---------------------------------------------------------------
	*/
		// Venda 01
		ItemComprado ic0 = new ItemComprado("Acer Nitro 5",5428.00,1);
		NotaFiscal nf0 = new NotaFiscal("888.999.777-00",new ItemComprado[] {ic0});
		
		v00.realizarVenda(nf0);
		
		// Venda 02
		ItemComprado ic1 = new ItemComprado("Teclado Mecânico",458.00,1);
		ItemComprado ic2 = new ItemComprado("Mouse Redragon",128.00,1);
		NotaFiscal nf1 = new NotaFiscal("659.844.547-50",new ItemComprado[] {ic1,ic2});
		
		v01.realizarVenda(nf1);
		
		// Venda 03
		ItemComprado ic3 = new ItemComprado("Monitor Ultrawide",1569.90,1);
		
		double valorCFrete = ic3.getPreco() + tv00.calcularFrete("56988-055");
		ic3.setPreco(valorCFrete);
		
		NotaFiscal nf2 = new NotaFiscal("011.498.887-90",new ItemComprado[] {ic3});
		
		tv00.realizarVenda(nf2);
	/*---------------------------------------------------------------
	 | 04 => Registrando funcionários em GestaoPessoas e imprimindo
	 |		 total dos salários;
	 |---------------------------------------------------------------
	*/
		GestaoPessoas gp = new GestaoPessoas();
		gp.addFuncionario(f00);
		gp.addFuncionario(f01);
		gp.addFuncionario(f02);
		gp.addFuncionario(f03);
		gp.addFuncionario(f04);
		
		System.out.println("O total gasto em pagamento: " + gp.calcSalarioTotal()); 
		//-> O total gasto em pagamento: 12875.939000000002
	}
	
	
	

}
