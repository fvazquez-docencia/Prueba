import java.util.Scanner;

/*
 * Realizar un diagrama de flujo de un programa que, dados dos números, 
 * imprima por pantalla la potencia de uno elevado al otro. 
 * Realizar el programa mediante la utilización de bucles y no mediante el operador ^. 
 */
public class Ejercicio18 {

	public static void main(String[] args) {
		// definición de variables
		int base;
		int exponente;
		int expAux;
		double resultado;

		Scanner sc = new Scanner(System.in);

		boolean valorCorrecto;
		base = exponente = 0;
		resultado = 1;
		// petición de la base
		do {
			System.out.println("Introduzca el valor de la base");
			if (sc.hasNextInt()) {
				base = sc.nextInt();
				valorCorrecto = true;
			} else {
				sc.next();
				valorCorrecto = false;
			}

		} while (valorCorrecto == false);

		// petición de la potencia
		do {
			System.out.println("Introduzca el valor del exponente");
			if (sc.hasNextInt()) {
				exponente = sc.nextInt();
				valorCorrecto = true;
			} else {
				sc.next();
				valorCorrecto = false;
			}

		} while (valorCorrecto == false);

		// Base y exponente obtenidos
		if (exponente == 0) {
			resultado = 1;
		} else {
			if (exponente > 0) {
				expAux = exponente;
			} else {
				expAux = -exponente;
			}
			
			for (int i = 1; i <= expAux; i++) {
				resultado = resultado * base;
			}
			
			/*int i=1;
			while(i<=expAux)
			{
				resultado = resultado * base;
				i++;
			}
			*/
			
			
			if(exponente<0)
				resultado=1/resultado;

		}

		// Impresion de resultado
		System.out.printf("El resultado de %d elevado a %d es %f", 
				base, exponente, resultado);

	}// main

}// class
