import java.util.Locale;
import java.util.Scanner;

/*
 * Realizar un diagrama de flujo que lea por teclado las notas de N alumnos 
 * que están matriculados en M asignaturas, si un alumno no está matriculado en 
 * una asignatura o no se presenta al examen se debe introducir como nota -1. 
 * El programa debe calcular y escribir el número de alumnos presentados a cada 
 * asignatura, la nota media, el número de suspensos, el número de aprobados, 
 * el número de notables y el número de sobresalientes. 
 
 */
public class Ejercicio19 {

	public static void main(String[] args) {
		// definición de variables
		int numAlumnos, numAsignat;
		double nota;
		int contAsig, contAlumn;
		int alumnPresentAsig,alumnNoPresentAsig;
		double sumaNotasAsig;
		int numSuspAsig, numAprobAsig, numNotAsig, numSobreAsig;

		boolean valorCorrecto;

		nota=alumnPresentAsig=alumnNoPresentAsig=0;
		sumaNotasAsig=0;
		numSuspAsig=0;
		numAprobAsig=0;
		numNotAsig=0;
		numSobreAsig=0;
		numAlumnos = 3;
		numAsignat = 2;

		Scanner sc = new Scanner(System.in);
		
		sc.useLocale(new Locale("ES-es"));

		for (contAsig = 0; contAsig < numAsignat; contAsig++)// Bucle recorrer Asignaturas
		{

			for (contAlumn = 0; contAlumn < numAlumnos; contAlumn++)// Bucle recorrer Alumnos
			{

				// Pedir notas de alumnos por asignatura
				do {
					System.out.printf("Introduce la nota de la asignatura %d y alumno %d ", contAsig, contAlumn);
					if (sc.hasNextDouble()) {
						nota = sc.nextDouble();

						if ((nota >= 0 && nota <= 10) || nota == -1)
							valorCorrecto = true;
						else {
							System.out.println("Debe introducirse un valor entre 0 y 10 o -1 para no presentado");
							valorCorrecto = false;
						}

					} else {
						sc.next();
						valorCorrecto = false;
						System.out.println("Debe introducirse un valor numérico");
					}
				} while (valorCorrecto == false);
				
				
				//Nota valida
				if(nota==-1)//No presentado
				{
					alumnNoPresentAsig++;
				}
				else//Presentado
				{
					if(nota<5)
						numSuspAsig++;
					else if(nota<7)
						numAprobAsig++;
					else if(nota<9)
						numNotAsig++;
					else
						numSobreAsig++;
					
					
					sumaNotasAsig=sumaNotasAsig+nota;
					alumnPresentAsig++;
					
				}
				
				
			}//for alumnos
			
			//Impresion resultados por asignatura
			System.out.printf("Los resultados para la asignatura %d son:\n", contAsig);
			System.out.printf("\tPresentados:%d\n", alumnPresentAsig);
			System.out.printf("\tNo presentados:%d\n", alumnNoPresentAsig);
			System.out.printf("\tSuspensos:%d\n", numSuspAsig);
			System.out.printf("\tAprobados:%d\n", numAprobAsig);
			System.out.printf("\tNotables:%d\n", numNotAsig);
			System.out.printf("\tSobresalientes:%d\n", numSobreAsig);
			System.out.printf("\tMedia:%f\n", sumaNotasAsig/alumnPresentAsig);
			
			//Reiniciar valores por asignatura
			nota=alumnPresentAsig=alumnNoPresentAsig=0;
			sumaNotasAsig=0;
			numSuspAsig=0;
			numAprobAsig=0;
			numNotAsig=0;
			numSobreAsig=0;
			

		}//for asignaturas

	}// main

}// class
