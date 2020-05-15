import java.util.Scanner;

/*
 * Calcula el valor máximo entre N números leídos por teclado
  */
public class Ejercicio13 {

	public static void main(String[] args) {
		// Definición de variables
		int numPeticiones;
		int numero;
		int valorMaximo;
		boolean valorCorrecto;
		
		Scanner sc= new Scanner(System.in);
		
		
		numPeticiones=5;
		valorMaximo=Integer.MIN_VALUE;
		numero=0;
		
		while(numPeticiones>0)
		{
		
			do
			{
				System.out.println("Introduzca un valor entero");
				
				if(sc.hasNextInt())//¿Es tipo entero?
				{
					numero=sc.nextInt();//Obtenemos el valor del buffer como entero
					
					if(numero>0)					
						valorCorrecto=true;
					else
						valorCorrecto=false;
				}
				else
				{
					sc.next();//Quitamos la letra o decimal del buffer
					valorCorrecto=false;
				}
			}while(valorCorrecto==false);
	
			
			//numero contiene un valor entero correcto
			if(valorMaximo<numero)
				valorMaximo=numero;
					
			numPeticiones--;
		}//while(numpeticiones>5)
		
		//sacar por pantalla el resultado
		System.out.printf("El valor máximo es %d",valorMaximo);
		
	}//main

}//clase
