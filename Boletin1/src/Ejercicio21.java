import java.util.Scanner;

/*
 * Realizar un algoritmo que funcione como una caja registradora. 
 * Deberá tener el siguiente funcionamiento: 
 * 	a. Al iniciar debe pedir al usuario la cantidad actual de dinero en la caja. 
 * 	b. Tras introducir esta cantidad inicial, el programa mostrará un menú al usuario donde se le ofrecerán tres opciones: 
 * 			i. 	Pulsar 1 para realizar un ingreso a caja 
 * 			ii. Pulsar 2 para realizar una retirada de caja. 
 * 			iii. Pulsar 0 para salir. 
 * c. Si el usuario pulsa 1, se le pedirá por pantalla un importe para ingresar, 
 * 		se sumará al importe dentro de la caja y se volverá a mostrar el menú. 
 * d. Si el usuario pulsa 2 se le pedirá un importe para retirar, 
 * 		se restará al importe dentro de la caja y se volverá a mostrar el menú. 
 * e. Si el usuario pulsa 0 se mostrará el importe restante de la caja y se terminará la ejecución. 
 * 
 * Nota: Si, en el caso de realizar la extracción de la caja el sistema queda con un valor de caja en negativo 
 * se mostrará un error por pantalla. 
 * 
 */
public class Ejercicio21 {

	public static void main(String[] args) {
		// definición de variables
		double cantidadCaja=0;
		int opcion = 0;
		double cantidad=0;

		boolean valorCorrecto;
		boolean valorCorrectoMenu;

		Scanner sc = new Scanner(System.in);

		// Petición de cantidad inicial
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
				// Menú al usuario
				System.out.println("Introduzca la opción a realizar:");
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

			// Realización programa
			
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
