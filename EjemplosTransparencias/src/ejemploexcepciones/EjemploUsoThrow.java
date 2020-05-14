package ejemploexcepciones;

@SuppressWarnings("serial")
class ExcepcionEdadInvalida extends IllegalArgumentException{
	ExcepcionEdadInvalida(String mensaje){
		super(mensaje);
	}
}

class Persona {
	private int edad;

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		if (edad <= 0)
			throw new ExcepcionEdadInvalida("La edad debe ser mayor que 0.");
		this.edad = edad;
	}
}// Persona

public class EjemploUsoThrow  {

	public static void main(String[] args) throws ClassNotFoundException{
		try {
			Persona p = new Persona();
			p.setEdad(-22);
		} catch (ExcepcionEdadInvalida ex) {
			System.out.println(ex.getMessage());
		}
	}// main

}// class	
		
		
//		try {
//			//c�digo
//			throw new ClassNotFoundException();
//			//
//		}catch(ClassNotFoundException exc)
//		{
//			//c�digo que controla la excepci�n
//			throw exc;
//			//En vez de lanzar otra vez exc 
//			// tambi�n podr�amos sustituirla por otra excepci�n nueva
//		}
		
		
		
		
		



