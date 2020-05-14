package ejemploexcepciones;

import java.beans.MethodDescriptor;

class ExcepcionChecked extends Exception{
	public ExcepcionChecked(String mensaje) {
		super(mensaje);
	}
}//ExcepcionChecked

class ExcepcionUnchecked extends RuntimeException{
	public ExcepcionUnchecked(String mensaje) {
		super(mensaje);
	}
}//ExcepcionUnchecked


public class EjemploCheckedUncheked {

	public static void main(String[] args){
	//	metodoAChecked();	//Da error porque al ser checked se obliga
							//a que se maneje (o ponemos try-catch o throws en la
							//cabecera
		
		metodoAUnchecked(); //Las unckecked no obligan a que el programador las controle.
	}//main
	
	public static void metodoAChecked() throws ExcepcionChecked
	{
		throw new ExcepcionChecked("Prueba");
	}//metodoAChecked
	
	
	public static void metodoAUnchecked() 
	{
		throw new ExcepcionUnchecked("Prueba");
	}//metodoAUnchecked

}//EjemploCheckedUncheked


