import java.util.Scanner;

/*
 * Realizar un algoritmo que funcione como una caja registradora. 
 * Deber� tener el siguiente funcionamiento: 
 * 	a. Al iniciar debe pedir al usuario la cantidad actual de dinero en la caja. 
 * 	b. Tras introducir esta cantidad inicial, el programa mostrar� un men� al usuario donde se le ofrecer�n tres opciones: 
 * 			i. 	Pulsar 1 para realizar un ingreso a caja 
 * 			ii. Pulsar 2 para realizar una retirada de caja. 
 * 			iii. Pulsar 0 para salir. 
 * c. Si el usuario pulsa 1, se le pedir� por pantalla un importe para ingresar, 
 * 		se sumar� al importe dentro de la caja y se volver� a mostrar el men�. 
 * d. Si el usuario pulsa 2 se le pedir� un importe para retirar, 
 * 		se restar� al importe dentro de la caja y se volver� a mostrar el men�. 
 * e. Si el usuario pulsa 0 se mostrar� el importe restante de la caja y se terminar� la ejecuci�n. 
 * 
 * Nota: Si, en el caso de realizar la extracci�n de la caja el sistema queda con un valor de caja en negativo 
 * se mostrar� un error por pantalla. 
 * 
 */
public class Ejercicio21 {

	public static void main(String[] args) {
		// definici�n de variables
		double cantidadCaja=0;
		int opcion = 0;
		double cantidad=0;

		boolean valorCorrecto;
		boolean valorCorrectoMenu;

		Scanner sc = new Scanner(System.in);

		// Petici�n de cantidad inicial
		do {
			System.out.println("Introduce la cantidad inicial");
			if (sc.hasNextDouble()) {
				cantidadCaja = sc.nextDouble();
				if (cantidadCaja >= 0)
					valorCorrecto = true;
				else
					valorCorrecto = false;
			} else {
				sc.next();
				valorCorrecto = false;
			}

		} while (valorCorrecto == false);

		do {

			do {
				// Men� al usuario
				System.out.println("Introduzca la opci�n a realizar:");
				System.out.println("\t0: Salir");
				System.out.println("\t1: Ingresar");
				System.out.println("\t2: Retirar");

				if (sc.hasNextInt()) {
					opcion = sc.nextInt();
					if (opcion == 0 || opcion == 1 || opcion == 2)
						valorCorrectoMenu = true;
					else
						valorCorrectoMenu = false;
				} else {
					sc.next();
					valorCorrectoMenu = false;
				}
			} while (valorCorrectoMenu == false);

			// Realizaci�n programa
			
			switch(opcion)
			{
				case 1:
					do
					{
						System.out.println("Indique la cantidad a ingresar:");
						if(sc.hasNextDouble())
						{
							cantidad=sc.nextDouble();
							if(cantidad>0)
							{
								valorCorrecto=true;
							}
							else
							{
								valorCorrecto=false;
							}						
						}
						else
						{
							sc.next();
							valorCorrecto=false;
						}
					}while(valorCorrecto==false);
					
					cantidadCaja=cantidadCaja+cantidad;
					break;
				case 2:
					do
					{
						System.out.println("Indique la cantidad a retirar:");
						if(sc.hasNextDouble())
						{
							cantidad=sc.nextDouble();
							if(cantidad>0)
							{
								if(cantidad<=cantidadCaja)
									valorCorrecto=true;
								else
								{
									System.out.println("La cantidad a retirar no puede ser mayor a " + cantidadCaja );
									valorCorrecto=false;
								}
							}
							else
							{
								valorCorrecto=false;
							}						
						}
						else
						{
							sc.next();
							valorCorrecto=false;
						}
					}while(valorCorrecto==false);
					
					cantidadCaja=cantidadCaja-cantidad;
					
					break;
			}

		} while (opcion != 0);
		
		System.out.printf("La cantidad final de caja es %f",cantidadCaja);
		
		

	}// main

}// class
