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
		HashSet<Paquete> listaResultado = (HashSet<Paquete>) this.listaPaquetes.stream()
				.filter(paquete -> paquete.getPeso() > peso).collect(Collectors.toSet());
		return listaResultado;
	}

	@Override
	public String toString() {
		return "Registro [listaPaquetes=" + listaPaquetes + "]";
	}

}
