package ejemploexcepciones;

import java.util.Scanner;

public class EjemploUsoFinally {
	public static void main(String[] args) {
		try {
			Scanner entradaEscanner= new Scanner(System.in);
			System.out.println("Introduzca el dividendo:");
			int dividendo=Integer.parseInt(entradaEscanner.nextLine());
			System.out.println("Introduzca el divisor:");
			int divisor=Integer.parseInt(entradaEscanner.nextLine());
			System.out.println("Resultado="+dividendo/divisor);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Imposible dividir por 0");
		}
		finally {
			System.out.println("Entrada en FINALLY");
		}
		System.out.println("FIN DEL PROGRAMA DE DIVISIÓN");
	}//main
}//class

