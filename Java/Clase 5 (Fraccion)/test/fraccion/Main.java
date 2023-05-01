package fraccion;

import java.util.Arrays;

import package1.Fraccion;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Fraccion[] ff = {
				new Fraccion(5, 9),
				new Fraccion(4, 8),
				new Fraccion(3, 6),
				new Fraccion(2, 8),
				new Fraccion(6, 1),
				new Fraccion(8, 3),
				new Fraccion(9, 6)
		};
		Fraccion[] ff2 = {
				new Fraccion(5, 1),
				new Fraccion(4, 1),
				new Fraccion(3, 1),
				new Fraccion(2, 1),
				new Fraccion(6, 1),
				new Fraccion(8, 1),
				new Fraccion(9, 1)
		};
		
//		System.out.println(ff);
		System.out.println(Arrays.toString(ff2));
		Arrays.sort(ff2);
		System.out.println(Arrays.toString(ff2));
		Fraccion f = new Fraccion(5,8);

		Fraccion f1 = new Fraccion(6,22);

		Fraccion f2 = new Fraccion(10,16);
		System.out.println(f);
//		System.out.println(Fraccion.x);
		System.out.println(Fraccion.mcd(5, 30));
		System.out.println(Fraccion.x);
		
		System.out.println("Hash " + f.hashCode());
		System.out.println("Hash " + f1.hashCode());
		System.out.println("Hash " + f2.hashCode());
	}

}
