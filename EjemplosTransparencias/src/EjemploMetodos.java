
public class EjemploMetodos {
	private int a;
	
	private void imprimirValores(int a)
	{
		System.out.println("El valor de la variable del método es " + a);
		System.out.println("El valor del campo de la clase es " + this.a);
		
	}//imprimirValores
	
	
	private void pruebaPasoReferencia(String valorA, char[] valorB,EjemploMetodos em,Character c)
	{
		valorA=valorA+"MOD";
		valorB[0]='M';
		em.a=9;
		c='%';
		System.out.println("Valores dentro del metodo");
		System.out.println(valorA);
		System.out.println(valorB);
		System.out.println(em.a);
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjemploMetodos ej= new EjemploMetodos();
		ej.a=10;
		ej.imprimirValores(12);
		
		
		String v="hola";
		char[] v2= {
				'C'
		};
		
		EjemploMetodos em1=new EjemploMetodos();
		em1.a=2;
		Character c1='A';
		System.out.println("Valores iniciales");
		System.out.println(v);
		System.out.println(v2);
		System.out.println(em1.a);	
		System.out.println(c1);
		
		ej.pruebaPasoReferencia(v, v2,em1,c1);
		
		System.out.println("Valores despues del metodo");
		System.out.println(v);
		System.out.println(v2);
		System.out.println(em1.a);
		System.out.println(c1);
		
	}//main
	
}//EjemploMetodos


