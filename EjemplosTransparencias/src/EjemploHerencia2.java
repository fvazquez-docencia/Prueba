@SuppressWarnings("unused")

public class EjemploHerencia2 {
	public static void main(String[] args) {
		B subclase = new B("B");
	}
}

class A {
	A() {
		System.out.println("Constructor en A");
	}
	
	A(String mensaje) {
		System.out.println(mensaje);
	}
}

class B extends A {
	B() {
		System.out.println("Constructor en B");
	}
	B(String mensaje) {
		super(mensaje);
		System.out.println(mensaje);
	}
}



