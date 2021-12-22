package br.edu.ifce.poo.formas.model;

public class Circulo implements AreaCalculavel,PerimetroCalculavel{
	private double raio;
	
	public Circulo() {
	}
	
	/**
	 * @param raio
	 */
	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		double area = Math.PI * (raio * raio);
		return area;
	}

	@Override
	public double calcularPerimetro() {
		double perimetro = Math.PI * (raio * 2);
		return perimetro;
	}
	
}
