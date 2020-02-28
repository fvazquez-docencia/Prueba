import utilidades.UtilObtencionDatos;

public class EjemploMenu {
	public static void main(String[] args) {
		int opcion=2;
		do {
			char c=26;
			System.out.printf("El caracter %c\n",26);
			
			
			System.out.println("Introduce:\n 1: Mostrar Si \n2 Mostrar No \n 0:Salir");
			opcion = UtilObtencionDatos.obtenerValorEntero("Introduce 0, 1 o 2");

			
			
			
			switch (opcion) {
			case 1:
				imprimirSi();
				break;
			case 2:
				System.out.println("No");
				break;
			case 0:// Opcion salir
				break;
			default:
				System.out.println("Has introducido un valor incorrecto");
				break;
			}
		} while (opcion != 0);
	}
	
	private static void imprimirSi()
	{
		System.out.println("Si");
	}
}
