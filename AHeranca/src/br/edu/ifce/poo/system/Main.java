package br.edu.ifce.poo.system;

public class Main {

	public static void main(String[] args) {
		ClientePFisica c1 = new ClientePFisica();
		c1.setCpf("968.548.699-54");
		
		ItemComprado i1_c1 = new ItemComprado("Bolacha Oreo", 3, 3);
		ItemComprado i2_c1 = new ItemComprado("Doritos", 3 , 1);
				
		NotaFiscal nf1_c1 = new NotaFiscal(new ItemComprado[]{
				i1_c1,i2_c1
		});
		
		c1.setListaNotas(new NotaFiscal[]{nf1_c1});
		
		ItemComprado i1_c2 = new ItemComprado("Coca-cola lata", 4.50, 5);
		ItemComprado i2_c2 = new ItemComprado("kit-kat", 3.75 , 10);
				
		NotaFiscal nf1_c2 = new NotaFiscal(new ItemComprado[]{
				i1_c2,i2_c2
		});
		
		ClientePJuridica c2 = new ClientePJuridica(new NotaFiscal[]{nf1_c2},"89.570.976/0001-03");
		
		
		System.out.println(c1.imprimir() + "|\n| "+c1.getCpf());
		System.out.println("-----------------------------");
		System.out.println(c2.imprimir() + "|\n| "+c2.getCnpj());
	}

}
