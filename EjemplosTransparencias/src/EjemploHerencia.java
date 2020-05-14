
public class EjemploHerencia {

	public static void main(String[] args) {
		ClasePadre cp = new ClasePadre();
		cp.edad = 25;

		ClaseHija ch = new ClaseHija();
		ch.edad = 26;
		ch.direccion = "";
	}
}

class ClasePadre {
	public int edad;
}

class ClaseHija extends ClasePadre {
	public String direccion;
	

}


