package edu.upc.eetac.dsa.ajara.ClasesEsenciales2;

public class PruebaThreads8 {

	public static void main(String args[]) throws InterruptedException {
		CuentaAtras8 contador1 = new CuentaAtras8("ID1", 4);
		CuentaAtras8 contador2 = new CuentaAtras8("ID2", 7);
		CuentaAtras8 contador3 = new CuentaAtras8("ID3", 8);
		
		contador1.start();
		contador2.start();
		contador3.start();
	}
}