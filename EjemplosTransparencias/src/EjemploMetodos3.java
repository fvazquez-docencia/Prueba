
public class EjemploMetodos3 {
	private int campo;

	private void pruebaPasoReferenciaObjetos(char[] valorArray,EjemploMetodos3 em)
	{
		EjemploMetodos3 em3= new EjemploMetodos3();
		em3.campo=9;
		
		//Después de esta asignación, las variables valorArray y em (dentro del método)
		//dejan de apuntar a las direcciones de memoria de las variables originales
		//y apuntan a otras nuevas
		valorArray= new char[]{'M'};
		em=em3;
		System.out.println("Valores dentro del metodo");
		System.out.println("Array: " + valorArray[0]);//M
		System.out.println("Instancia:" + em.campo);//9
	}
	
	
	public static void main(String[] args) {

		char[] valorArray= {'C'};
		EjemploMetodos3 em1=new EjemploMetodos3();
		em1.campo=2;

		System.out.println("Valores iniciales Objetos");
		System.out.println("Array: " + valorArray[0]);//C
		System.out.println("Instancia:" + em1.campo);//2
		
		em1.pruebaPasoReferenciaObjetos(valorArray,em1);
		
		System.out.println("Valores despues del metodo");
		System.out.println("Array: " + valorArray[0]);//C
		System.out.println("Instancia:" + em1.campo);//2
	
	}//main	
}//EjemploMetodos3


