package br.edu.ifce.poo.formas.model;

public class Retangulo implements AreaCalculavel,PerimetroCalculavel{
	private double base;
	private double altura;
	
	public Retangulo() {
	}
	
	/**
	 * @param base
	 * @param altura
	 */
	public Retangulo(double base, double altura) {
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
		double area = base * altura;
		return area;
	}

	@Override
	public double calcularPerimetro() {
		double perimetro = 2 * (base + altura);
		return perimetro;
	}
}
