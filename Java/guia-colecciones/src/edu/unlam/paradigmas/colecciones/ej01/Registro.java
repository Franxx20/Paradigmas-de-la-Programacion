package edu.unlam.paradigmas.colecciones.ej01;

import java.util.HashSet;
import java.util.stream.Collectors;

public class Registro {
	HashSet<Paquete> listaPaquetes;

	public Registro(HashSet<Paquete> listaPaquetes) {
		this.listaPaquetes = listaPaquetes;
	}

	public Registro() {
		this.listaPaquetes = new HashSet<Paquete>();
	}

	public void agregarPaquete(Paquete paquete) {
		this.listaPaquetes.add(paquete);

	}

	public Paquete buscarPaquete(int nroSeguimiento) {
		for (Paquete paquete : listaPaquetes) {
			if (Integer.compare(nroSeguimiento, paquete.getNroSeguimiento()) == 0)
				return paquete;

		}
		return null;
	}

	public HashSet<Paquete> buscarPorPeso(double peso) {
		return (HashSet<Paquete>) this.listaPaquetes.stream()
				.filter(paquete -> paquete.getPeso() > peso).collect(Collectors.toSet());
	}

	@Override
	public String toString() {
		return "bin.edu.unlam.paradigmas.colecciones.ej05.Registro [listaPaquetes=" + listaPaquetes + "]";
	}

}
