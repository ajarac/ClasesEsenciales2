package edu.upc.eetac.dsa.ajara.ClasesEsenciales2;

public class PruebaThreads {
	static String clase = null;
	static int t = 0;
	public static void main(String args[]) {

		(new Thread(new CuentaAtras10("ID1", 4))).start();
		(new Thread(new CuentaAtras10("ID2", 7))).start();
		(new Thread(new CuentaAtras10("ID3", 8))).start();
		
	}
	
	public static int getT()
	{
		return t;
	}
	
	public static void setT(int i)
	{
		PruebaThreads.t = i;
	}
	public static String getClase()
	{
		return clase;
	}
	
	public static void setClase(String i)
	{
		PruebaThreads.clase = i;
	}
}
