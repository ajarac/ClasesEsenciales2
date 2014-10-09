package edu.upc.eetac.dsa.ajara.ClasesEsenciales2;

public class PruebaThreads9 {

	public static void main(String args[]) {
		
		(new Thread(new CuentaAtras9("ID1", 4))).start();
		(new Thread(new CuentaAtras9("ID2", 7))).start();
		(new Thread(new CuentaAtras9("ID3", 8))).start();
	}
}
