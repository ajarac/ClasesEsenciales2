package edu.upc.eetac.dsa.ajara.ClasesEsenciales2;

public class CuentaAtras10 implements Runnable {
	int cont;
	String id;

	public CuentaAtras10(String s, int i) {
		this.cont = i;
		this.id = s;
	}

	public void run() {
		PruebaThreads.setT(PruebaThreads.getT() + 1);

		while (cont >= 0) {
			String s = PruebaThreads.getClase();

			if (s == null) {
				System.out.println(this.id + " - " + cont
						+ " Sin ultima lectura");
			} else {
				System.out.println(this.id + " - " + cont
						+ " Ultima escritura " + s);
			}
			PruebaThreads.setClase(id);
			if (cont == 0) {
				int r = PruebaThreads.getT();
				PruebaThreads.setT(r - 1);
				System.out.println("Ultima escritura "
						+ PruebaThreads.getClase() + " - " + (r - 1)
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