import java.util.Scanner; //Importación de paquetes

//Otras posibles formas utilizar la clase serían
//Importar todas las clases del paquete que la contiene (java.util)
//import java.util.*;
//o indicar la ruta de la clase al utilizar Scanner
// java.util.Scanner sc= new java.util.Scanner(System.in);


public class Ejercicio01 {

	public static void main(String[] args) {//Método main. Es el método de entrada del proceso
		
		
		System.out.println("Introduzca un número");
		Scanner sc;//Definimos el objeto de la clase Scanner, que se encarga de monitorizar los datos introducidos
		sc=new Scanner(System.in);//Creamos el objeto de la clase Scanner contra la entrada por teclado (System.in)
		
		if(sc.hasNextInt()) //Comprobamos que el usuario introduzca un valor entero
		{
			int valorLeido = sc.nextInt();	//Obtenemos ese valor entero que el usuario introdujo por teclado y lo guardamos
											//En una variable llamada valorLeido
			
			System.out.println(valorLeido); //Sacamos por pantalla el valor de la variable valorLeido
		}
		else //Si no introduce un valor entero mostramos un error
		{
			System.out.println("No has introducido un entero");
		}
		
		sc.close();	//No sería necesario cerrar la conexión del objeto Scanner con el teclado 
					//(al terminar el proceso) pero lo realizamos igualmente

	}

}
