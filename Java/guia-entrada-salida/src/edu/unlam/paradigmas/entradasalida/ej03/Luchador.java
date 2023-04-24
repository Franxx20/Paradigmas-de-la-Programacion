package edu.unlam.paradigmas.entradasalida.ej03;

public class Luchador {
	private int peso;
	private int altura;

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	Luchador(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public boolean dominaA(Luchador otro) {
		return (this != otro) && (this.peso >= otro.peso && this.altura >= otro.altura);
	}
}
