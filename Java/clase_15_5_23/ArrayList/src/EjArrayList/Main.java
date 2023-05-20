package EjArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		if(lista.isEmpty())
			System.out.println("La lista esta vacia");
		
		lista.add(22);
		lista.add(23);
		lista.add(-11);
		lista.add(2456);
		
		if(lista.contains(22))
			System.out.println("La lista contiene el numero " + 22);
		
		System.out.println(lista.get(0));
		System.out.println(lista.indexOf(-11));
		
		lista.add(4,22);
		
		System.out.println(lista.get(4));
		
		lista.remove((Integer)23);
		System.out.println(lista.get(1));
		lista.remove(0);
		System.out.println(lista.get(0));
		
		///lista.forEach(); recorrer
		for (Integer elemento : lista) {
			System.out.println(elemento);
		}
		
		int tamanio = lista.size();

		lista.clear(); ///Se vacia
		
	}
	
	

}
