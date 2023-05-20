package EjException;

public class Cuenta {

	private double saldo;
	
	public Cuenta(double x){
		saldo = x;
	}
	
	public void extraer(double x){
		if(x > saldo)
			throw new SaldoInsuficienteException();
		
		saldo -= x;
	}
	
}
