package ejemplosherencia;

class A{
	String c1="rojo";
	String c2="negro";
}//A

class B extends A{
	int c1=1;
}//B

class C extends B{
	char c1='5';
	
	void verCampos()
	{
		System.out.println();
		System.out.println("--------IMPRESION DESDE EL INTERIOR DE LA CLASE----------");
		System.out.println("Campo c2 de C:" + c2);//Campo c2 de C:negro
		System.out.println("Campo c1 de C:" + c1);//Campo c1 de C:5
		System.out.println("Campo c1 de C:" + this.c1);//Campo c1 de C:5
		System.out.println("Campo c1 oculto de B: " + super.c1);//Campo c1 oculto de B: 1
		System.out.println("Campo c1 oculto de B: " + ((B)this).c1);//Campo c1 oculto de B: 1
		System.out.println("Campo c1 oculto de B: " + ((A)this).c1);//Campo c1 oculto de B: rojo
	}//verCampos
}//C

public class EjemploAccesoCamposSuperclase {

	public static void main(String[] args) {
		C obj= new C();
		System.out.println("--------IMPRESION DESDE EL EXTERIOR DE LA CLASE----------");
		System.out.println("Campo c2 de C:" + obj.c2);//Campo c2 de C:negro
		System.out.println("Campo c1 de C:" + obj.c1);//Campo c1 de C:5
		System.out.println("Campo c1 oculto de B:" + ((B)obj).c1);//Campo c1 oculto de B:1
		System.out.println("Campo c1 oculto de A:" + ((A)obj).c1);//Campo c1 oculto de A:rojo
		
		obj.verCampos();
	}

}//EjemploAccesoCamposSuperclase

