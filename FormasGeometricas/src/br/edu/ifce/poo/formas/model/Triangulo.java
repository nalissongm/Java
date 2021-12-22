package br.edu.ifce.poo.formas.model;

public class Triangulo implements AreaCalculavel{
	private double base;
	private double altura;
	
	public Triangulo() {
	}
	
	
	/**
	 * @param base
	 * @param altura
	 */
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		double area = (base * altura)/2;
		return area;
	}
}
