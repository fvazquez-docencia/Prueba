import java.util.Scanner;

/*
 * .Hacer un diagrama de flujo que calcule el factorial de un número N 
 * (N!=N*(N-1)*(N-2)*...*1).
 * 
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		// Declaración de variables
		int num;
		int factorial;
		int iterador;

		boolean valorCorrecto;
				
		num=0;
		factorial=1;
		
		Scanner sc= new Scanner(System.in);
		
		do
		{
			System.out.println("Introduce un valor entero positivo");
			if(sc.hasNextInt())
			{
				 num=sc.nextInt();
				 if(num>=0)
					 valorCorrecto=true;
				 else
					 valorCorrecto=false;
			}
			else
			{
				sc.next();
				valorCorrecto=false;
			}
			
		}while(valorCorrecto==false);
		
		//num es un entero positivo
		
		
		//for
		/*for(iterador=num;iterador>0;iterador--)
		{
			factorial=factorial*iterador;
		}*/
		
		//while creciente
		/*
		iterador=1;		
		while(iterador<=num)
		{
			factorial=factorial*iterador;
			iterador++;
		}
		*/
		
		//while decreciente
		/*
		 iterador=num;
		 
		while(iterador>0)
		{
			factorial=factorial*iterador;
			iterador--;
		}
		*/
		
		iterador=num;
		if(iterador==0)
			factorial=1;
		else
		{
			do
			{
				factorial=factorial*iterador;
				iterador--;
			}while(iterador>0);
		}
		//Impresión de resultado
		System.out.printf("%d! es %d",num,factorial);
		//System.out.println(num + "!" + " es " + factorial);
		
	}//main

}//class
