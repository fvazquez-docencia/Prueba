package ejemploexcepciones;

import java.io.IOException;

public class EjemploPropagacion {
	private int caracter;

	public static void main(String[] args) {
		EjemploPropagacion ej= new EjemploPropagacion();
		try
		{
			ej.leerCaracter();
			ej.imprimirCaracter();
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void leerCaracter()throws IOException{
		System.out.println("Introduzca caracter a leer");
		caracter=System.in.read();
	}

	public void imprimirCaracter() {
		System.out.println("Imprimiendo caracter:");
		System.out.println((char) caracter);
	}
}//class

