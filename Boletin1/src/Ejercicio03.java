
//Importaci�n de las clases externas para su uso
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		//Definici�n de variables
		int num1;
		int num2;
		int suma;
		int resta;
		
		//Definici�n e inicializaci�n del objeto Scanner
		Scanner sc= new Scanner(System.in);
		
		
		//Petici�n de valores
		
		System.out.println("Introduce el primer n�mero");
		if(sc.hasNextInt())
		{
			num1=sc.nextInt();			
		}
		else
		{
			System.out.println("No has indicado un valor correcto para el primer n�mero");
			num1=0;
		}
		
		System.out.println("Introduce el segundo n�mero");
		if(sc.hasNextInt())
		{
			num2=sc.nextInt();
		}
		else
		{
			System.out.println("No has indicado un valor correcto para el segundo n�mero");	
			num2=0;
		}


		suma=num1+num2;
		resta=num1-num2;
		
		System.out.printf("La suma de %d y %d es %d",num1,num2,suma);
		System.out.printf("La resta de %d y %d es %d",num1,num2,resta);
		

	}

}
