
public class EjemploMetodos2 {
	private int campo;

	private void pruebaPasoReferenciaPrimitivos(int valorInt,String valorString,Character valorCaracter)
	{
		valorInt=121;
		valorString=valorString+"MOD";
		valorCaracter='%';
		System.out.println("Valores dentro del metodo");
		System.out.println("Int:" + valorInt);
		System.out.println("String: " + valorString);
		System.out.println("Caracter: " + valorCaracter);
	}
	
	private void pruebaPasoReferenciaObjetos(char[] valorArray,EjemploMetodos2 em)
	{
		valorArray[0]='M';
		em.campo=9;
		System.out.println("Valores dentro del metodo");
		System.out.println("Array: " + valorArray[0]);
		System.out.println("Instancia:" + em.campo);
	}
	
	public static void main(String[] args) {
		String valorString="hola";
		int valorInt=2;
		Character valorCaracter='A';
		
		char[] valorArray= {'C'};
		EjemploMetodos2 em1=new EjemploMetodos2();
		em1.campo=2;

		System.out.println("Valores iniciales primitivos");
		System.out.println("Int:" + valorInt); //2
		System.out.println("String: " + valorString); //hola
		System.out.println("Caracter: " + valorCaracter); //A
		
		em1.pruebaPasoReferenciaPrimitivos(valorInt, valorString,valorCaracter);
		
		System.out.println("Valores despues del metodo");
		System.out.println("Int:" + valorInt);//2
		System.out.println("String: " + valorString);//hola
		System.out.println("Caracter: " + valorCaracter);//A
			
		System.out.println();
		
		System.out.println("Valores iniciales Objetos");
		System.out.println("Array: " + valorArray[0]);//C
		System.out.println("Instancia:" + em1.campo);//2
		
		em1.pruebaPasoReferenciaObjetos(valorArray,em1);
		
		System.out.println("Valores despues del metodo");
		System.out.println("Array: " + valorArray[0]);//M
		System.out.println("Instancia:" + em1.campo);//9
	
	}//main	
}//EjemploMetodos


