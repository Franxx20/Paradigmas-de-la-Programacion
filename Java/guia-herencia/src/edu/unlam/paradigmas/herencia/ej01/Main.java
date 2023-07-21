package edu.unlam.paradigmas.herencia.ej01;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // main
//		Cuenta cuentaOrigen = new Cuenta();
//		cuentaOrigen.depositar(10000);
//		System.out.println(cuentaOrigen.consultarSaldo()); // 10000
//		Cuenta cuentaDestino = new Cuenta();
//		System.out.println(cuentaDestino.consultarSaldo()); // 0
//		cuentaOrigen.transferir(550, cuentaDestino);
//		System.out.println(cuentaOrigen.consultarSaldo()); // 9450
//		System.out.println(cuentaDestino.consultarSaldo()); // 550
//
//		System.out.println(cuentaOrigen.consultarHistorial());
//
//		Cuenta cuentaCorriente = new CuentaCorriente(50.0);
//		cuentaCorriente.depositar(150);
//		System.out.println(cuentaCorriente.consultarSaldo());
//
//		cuentaCorriente.extraer(200);
//		System.out.println(cuentaCorriente.consultarSaldo());
//
//		cuentaCorriente.extraer(1);
//		System.out.println(cuentaCorriente.consultarSaldo());
        Persona p1 = new Estudiante();
        Persona p3 = new Estudiante();
        Estudiante p2 =  new Estudiante();

        p1.saludar();
        p2.saludar();
        p2.darPresente();
        p3.saludar();
    }

}
