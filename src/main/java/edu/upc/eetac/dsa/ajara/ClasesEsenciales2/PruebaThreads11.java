package edu.upc.eetac.dsa.ajara.ClasesEsenciales2;

public class PruebaThreads11 {
	static String clase = null;
	static int t = 0;

	public static void main(String args[]) {

		(new Thread(new CuentaAtras11("ID1", 4))).start();
		(new Thread(new CuentaAtras11("ID2", 7))).start();
		(new Thread(new CuentaAtras11("ID3", 8))).start();

	}

	public synchronized static int getT() {
		return t;
	}

	public synchronized static void setT(int i) {
		PruebaThreads11.t = i;
	}

	public synchronized static String getClase() {
		return clase;
	}

	public synchronized static void setClase(String i) {
		PruebaThreads11.clase = i;
	}
}
