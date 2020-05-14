package ejemploaccesoficheros;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFileOutputStream {
	public static void main(String[] args) {
		FileOutputStream fos;
		try {
			String path = "C:\\Temp\\ejemplosStream\\fichero.bin";
			fos = new FileOutputStream(path);
			String mensaje="Prueba de mensaje a imprimir\nEsto es lo que contiene123k@#/";
			fos.write(mensaje.getBytes());//Escribe en el fichero el array de bytes
			fos.flush();//Forzar que se vacíe el buffer
			fos.close();//cierre del fichero
		} catch (FileNotFoundException ex) {
			System.out.printf("\nHa ocurrido un error. No se ha encontrado el fichero:\n%s", ex.getMessage());
		} catch (IOException ex) {
			System.out.printf("\nHa ocurrido una excepción indeterminada:\n%s", ex.getMessage());
		}
	}//main

}//class

