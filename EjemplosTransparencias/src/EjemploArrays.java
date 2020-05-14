import java.util.Arrays;

public class EjemploArrays {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		short [] edades;
		int [] pesos;
		int precios[];
		char [] caracteres;
		int [] [] matriz;
		
		//Diferentes formas de instanciar los arrays
		//Se crean con el tamaño definido y con el
		//valor 'neutro' para el tipo (0 para los numéricos, 
		//'' para los char,"" para los string,...)
		edades= new short[10];
		pesos= new int[100];
		precios = new int[10];
		matriz = new int [4] [2];
		caracteres = new char[5];
		
		
		edades[0]=1;
		matriz[0][1]=2;
		caracteres[0]='a';
		
		char[] letras= {'a','b','c'};
		byte [] [] arrayBidimensional= {
			{1,2,3},
			{4,5}
		};
		
		
		//Llamada al método
		int [][] retorno= miMetodo(edades,pesos);
		
		
		
		
		int longitud= edades.length;//Es 10. Es igual al tamaño del array
		
		
		longitud = matriz.length; //4
		longitud = matriz[0].length; //2
		longitud = matriz[1].length; //2
		
		for(int i=0;i<edades.length;i++)
		{
			System.out.println(edades[i]);
		}

		for(int i=edades.length-1;i>=0;i--)
		{
			System.out.println(edades[i]);
		}
		

		for(char letra:letras)
		{
			System.out.print(letra);
		
		}
		
		
		String[] alumnos= {"Luis","Rodrigo","Miguel"};
		Arrays.sort(alumnos);
		int posicion=Arrays.binarySearch( alumnos, "Luis");
		System.out.println("Encontrado en la posición " + posicion);
		posicion=Arrays.binarySearch(alumnos, "Miguel");
		System.out.println("Encontrado en la posición " + posicion);
		
		
		String cadena1="Hola mundo";
		System.out.println(cadena1);
		
		char arrayCaracteres[]= {'H','o','l','a',' ','M','u','n','d','o'};
		String cadena2= new String(arrayCaracteres);
		System.out.println(cadena2);
		
		
		
	}// main

	// declaración del método
	public static int[][] miMetodo(short[] array1, int[] array2) {
		/// ….
		int arrayRetorno[][] = new int[4][2];
		///
		return arrayRetorno;
	}
}
