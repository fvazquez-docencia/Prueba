import java.util.Scanner;

/*
	Realizar un diagrama de flujo de un programa que calcule la media de todas las
	notas indicadas por pantalla (se pedirán notas al usuario hasta que este
	introduzca un 0).
 */
public class Ejercicio17 {

	public static void main(String[] args) {
		// Definicion de variables
		int nota=0;
		boolean valorCorrecto=false;
		boolean terminarInsercion=false;
		int numeroNotas=0;
		int sumaNotas=0;
		double mediaNotas;
		
		
		Scanner sc= new Scanner(System.in);
		
		//Obtención de datos del usuario
		do
		{
			do
			{
				System.out.println("Introduce una nota, 0 para salir");
				if(sc.hasNextInt())
				{
					nota=sc.nextInt();
					if(nota>=0)
						valorCorrecto=true;
					else 
					{
						valorCorrecto=false;
						System.out.println("El valor introducido ha de ser un numero entero positivo");
					}
				}
				else
				{
					sc.next();
					valorCorrecto=false;
					System.out.println("El valor introducido ha de ser un numero entero positivo");
				}
			}
			while(!valorCorrecto);
			
			if(nota==0)
				terminarInsercion=true;
			else
			{
				terminarInsercion=false;
				sumaNotas=sumaNotas+nota;
				numeroNotas++;
			}
			
		}while(!terminarInsercion);
		sc.close();

		
		//Impresión resultados
		mediaNotas=(double)sumaNotas/numeroNotas;//La división entre enteros devuelve un valor entero. Si queremos una división con decimales hay que convertir uno de los enteros en double o float
		System.out.printf("La media de las %d notas es %f",numeroNotas,mediaNotas);
		
	}

}
