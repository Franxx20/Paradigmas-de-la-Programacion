package unlam.paradigmas.diagnostico;


public class Main {

	public static void main(String[] args) {
		int matriz[][] = { { 2, 2, 0 }, { 2, 2, 6 }, { 7, 8, 5 } };

		//System.out.println("Resultado: " + resolver(matriz));
//		System.out.println("hola Mundo");

		boolean resultado = Ejercicio01.resolver(matriz);
		System.out.println("Resultado: " + resultado);

	}

}
