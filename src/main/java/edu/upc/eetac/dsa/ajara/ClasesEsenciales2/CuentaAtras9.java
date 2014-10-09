package edu.upc.eetac.dsa.ajara.ClasesEsenciales2;

public class CuentaAtras9 implements Runnable{
	int cont;
	String id;

	public CuentaAtras9(String s, int i) {
		this.cont = i;
		this.id = s;
	}

	public void run() {
		while (cont > 0) {
			System.out.println(this.id + ": " + cont);
			cont--;
			Delaysegundo();
		}
	}

	private void Delaysegundo() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}
}
