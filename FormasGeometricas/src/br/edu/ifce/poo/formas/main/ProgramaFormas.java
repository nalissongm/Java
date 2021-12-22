package br.edu.ifce.poo.formas.main;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifce.poo.formas.model.AreaCalculavel;
import br.edu.ifce.poo.formas.model.Circulo;
import br.edu.ifce.poo.formas.model.PerimetroCalculavel;
import br.edu.ifce.poo.formas.model.Retangulo;
import br.edu.ifce.poo.formas.model.Triangulo;

public class ProgramaFormas {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo(3, 4);
		System.out.println("Area do Triangulo: " + t1.calcularArea() + "\n");
		
		Circulo c1 = new Circulo(4);
		System.out.println("Area do Circulo: " + c1.calcularArea());
		System.out.println("Perimetro do Circulo: " + c1.calcularPerimetro() + "\n");
		
		Retangulo r1 = new Retangulo(8,4);
		System.out.println("Area do Retangulo: " + r1.calcularArea());
		System.out.println("Perimetro do Retangulo: " + r1.calcularPerimetro() + "\n");
		
		List<AreaCalculavel> listArea = new ArrayList<AreaCalculavel>();
		listArea.add(t1);
		listArea.add(c1);
		listArea.add(r1);

		double areaTotal = 0.0;
		for(AreaCalculavel ac: listArea) {
			areaTotal += ac.calcularArea();
		}
		
		List<PerimetroCalculavel> listPerimetro = new ArrayList<PerimetroCalculavel>();
		listPerimetro.add(c1);
		listPerimetro.add(r1);
		
		double perimetroTotal = 0.0;
		for(PerimetroCalculavel pc: listPerimetro) {
			perimetroTotal += pc.calcularPerimetro();
		}
		
		System.out.println("Area Total: " + areaTotal);
		System.out.println("Perimetro Total: " + perimetroTotal);
	}

}
