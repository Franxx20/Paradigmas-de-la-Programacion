package edu.unlam.paradigmas.colecciones.ej01;

import java.util.Objects;

public class Paquete implements Comparable<Paquete> {
	private int nroSeguimiento;
	private String direccionOrigen;
	private String direccionDestino;
	double peso;

	public Paquete(int nroSeguimiento, String direccionOrigen, String direccionDestino, double peso) {
		this.nroSeguimiento = nroSeguimiento;
		this.direccionOrigen = direccionOrigen;
		this.direccionDestino = direccionDestino;
		this.peso = peso;
	}

	public int getNroSeguimiento() {
		return nroSeguimiento;
	}

	public String getDireccionOrigen() {
		return direccionOrigen;
	}

	public String getDireccionDestino() {
		return direccionDestino;
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "\n" + "Paquete [nroSeguimiento=" + nroSeguimiento + ", Origen=" + direccionOrigen + ", Destino="
				+ direccionDestino + ", peso=" + peso + "]" + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nroSeguimiento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paquete other = (Paquete) obj;
		return nroSeguimiento == other.nroSeguimiento;
	}

	@Override
	public int compareTo(Paquete o) {
		return Integer.compare(getNroSeguimiento(), o.getNroSeguimiento());
	}

}
