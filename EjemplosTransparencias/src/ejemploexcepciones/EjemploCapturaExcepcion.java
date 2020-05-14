package ejemploexcepciones;

import java.util.Scanner;

public class EjemploCapturaExcepcion {
	public static void main(String[] args) {
		String valor="345.12";
		Scanner sc= new Scanner(System.in);
		int valorInt;
		try
		{
			valorInt=Integer.parseInt(sc.next());
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Se ha producido una excepción al intentar"
					+ "transformar " + valor + " a entero");
			ex.printStackTrace();
		}
		catch(Exception ex)	//Es una generalización superior. Si no se captura en el anterior
		{					// catch se capturará en este
			System.out.println("Se ha producido una excepción indeterinada"
					+ "en la transformación del valor");
			ex.printStackTrace();
		}
	}//main
}//class


