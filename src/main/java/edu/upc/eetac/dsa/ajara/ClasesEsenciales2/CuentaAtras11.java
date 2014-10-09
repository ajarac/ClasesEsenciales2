package edu.upc.eetac.dsa.ajara.ClasesEsenciales2;

public class CuentaAtras11 implements Runnable {
	int cont;
	String id;

	public CuentaAtras11(String s, int i) {
		this.cont = i;
		this.id = s;
	}

	public void run() {
		PruebaThreads11.setT(PruebaThreads11.getT() + 1);

		while (cont >= 0) {
			String s = PruebaThreads11.getClase();

			if (s == null) {
				System.out.println(this.id + " - " + cont
						+ " Sin ultima lectura");
			} else {
				System.out.println(this.id + " - " + cont
						+ " Ultima escritura " + s);
			}
			PruebaThreads11.setClase(id);
			if (cont == 0) {
				int r = PruebaThreads11.getT();
				PruebaThreads11.setT(r - 1);
				System.out.println("Ultima escritura "
						+ PruebaThreads11.getClase() + " - " + (r - 1)
						+ " Threads activos");
			} else {
				Delaysegundo();

			}
			cont--;
		}
	}

	private void Delaysegundo() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}
}