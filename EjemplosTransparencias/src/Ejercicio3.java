import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio3
{
	public static void main(String[] args)
	{
		String frase= pedirFrase();//Llama a la función pedirFrase y recoge el String que devuelve y lo guarda en frase
		char[][] arrayComparado= arrayApariciones(frase);/*Llama a la función arrayApariciones, le pasa la frase que
		 												obtuvimos previamente, y la función la mete carácter a carácter
		 												en un array, y además indica cuántas veces aparece cada carácter.
		 												Por último guarda ese array en arrayComparado.*/
		imprimirArrayComparado(arrayComparado, frase); /*Llama a la función imprimirArrayComparado, le pasa la frase para
		 												que la muestre al usuario, y además imprime el arrayComparado,
		 												separando cada carácter del número de veces que aparece.*/
		
	}//main
	
	public static String pedirFrase()//Muestra el mensaje al usario de pedir la frase, la coge y la guarda como String.
	{
		System.out.println("Escribe una frase cualquiera.");
		Scanner sc= new Scanner(System.in);
		String cadenaTexto= sc.nextLine();
		return cadenaTexto;
	}//funcion pedirFrase
	
	public static char[][] arrayApariciones(String frase)
	{
		
		char[][] arrayFrase= new char [frase.length()][2];
		/*Crea un array nuevo de tipo char llamado arrayFrase, que tendrá dos dimensiones: una que tenga tantos cajones
		como la longitud del String frase, y para cada cajón, un array de longitud 2 que en su primer cajón tendrá
		cada carácter de la frase, y en el segundo el número de veces que aparece. Si hay repeticiones, en el cajón que
		contiene la letra que aparece por primera vez se anota el número total de repeticiones, y el los demás donde
		aparece de nuevo la letra, se dejan en blanco.*/
		
		for(int i=0; i<frase.length(); i++)
		{
			arrayFrase[i][0]= frase.charAt(i);
		}
		//Con este for cogemos cada caracter del String y lo metemos en el primer subcajón de cada cajón del Array.
		
		for(int i=0; i<arrayFrase.length; i++)
		{
			char comparador1= arrayFrase[i][0];
			int repeticiones= 0;
			for(int j=0; j<arrayFrase.length; j++)
			{
				char comparador2= arrayFrase[j][0];
				if(comparador1==comparador2)
				{
					repeticiones= repeticiones+1;
					char repet= String.valueOf(repeticiones).charAt(0);
					arrayFrase[i][1]= repet;
				}
				else
					arrayFrase[i][1]= String.valueOf(repeticiones).charAt(0);
			}
		}
				
		return arrayFrase;/*Devuelve el array tal que: cada elemento es un array de dos elementos: uno es cada letra
		 					de la frase, y el siguiente el número de veces que aparece en la frase.*/
	}//arrayApaciciones
	
	public static void imprimirArrayComparado(char[][] arrayComparado, String frase)
	{
		System.out.println("En la frase: " + frase);
		System.out.println("Cada carácter: ");
		for(int i=0; i<arrayComparado.length; i++)
		{
			System.out.println(arrayComparado[i][0] + ", aparece " + arrayComparado[i][1] + " veces.");
		}
	}//imprimirArrayComparado
}//class ejercicio 3
