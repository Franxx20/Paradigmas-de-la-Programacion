package EjException;

public class Clase {
	
	public double divison(int x, int y){
		if(y == 0)
			throw new ArithmeticException();
		
		return x/y;
	}
	
	public double raizCuadrada(int x) throws RaizException{
		
		if(x < 0)
			throw new RaizException();
		
		return Math.sqrt(x);
	}

}
