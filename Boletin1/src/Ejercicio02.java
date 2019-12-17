import java.util.Scanner;//Importación de la clase Scanner para su uso posterior

public class Ejercicio02 {

	public static void main(String[] args) {

		double base=0; 		//Definición de las variables necesarias en el programa		
		double altura=0;	//Las declaro a un valor inicial 0 para no tener problemas en compilación
		double resultado=0;
		
		Scanner sc= new Scanner(System.in); //Definición de un objeto Scanner llamado sc e inicialización con la entrada por teclado
		
		System.out.println("Introduzca el valor de la base");
		
		if(sc.hasNextDouble()) //Comprobación de que el usuario introduce un valor Double (número real)
		{
			base = sc.nextDouble(); //Se obtiene el valor double que e usuario introduce y se guarda en la variable base
		}
		else	//Si el usuario no introdujo un double se muestra un mensaje de error			
		{
			System.out.println("No has introducido un valor válido para la base");
			sc.next();//Tenemos que librarnos del valor erróneo en memoria para que no lo use
					  //la siguiente lectura del Scanner
					  //No hace falta guardarlo en ninguna variable ya que no lo vamos a utilizar.	
		}
		
		System.out.println("Introduzca el valor de la altura");
		
		if(sc.hasNextDouble()) //Igual que con la base, se comprueba que lo que el usuario introduce es un double
		{
			altura = sc.nextDouble();
		}
		else
		{
			System.out.println("No has introducido un valor válido para la altura");
			//En este caso no es necesario deshacerse del valor en buffer ya que no realizamos lecturas posteriores
		}
		
		resultado=base*altura/2; //Cálculo del resultado y guardado en la variable
		
		System.out.println("El valor del área es " + resultado);//Se muestra el valor del área
		
		sc.close();//Cierre del Scanner (no sería necesario al terminarse el programa)
		
		
	}

}
