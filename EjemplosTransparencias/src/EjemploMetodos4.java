
public class EjemploMetodos4 {
	private int suma(int n1, int n2) {
		return n1+n2;
	}

	private void imprimirHolaMundo() {
		System.out.println("Hola Mundo");
	}

	public static void main(String[] args) {
		EjemploMetodos4 ejM4 = new EjemploMetodos4();
		System.out.println(ejM4.suma(2, 3));
		ejM4.imprimirHolaMundo();
	}// main
}// EjemploMetodos4



