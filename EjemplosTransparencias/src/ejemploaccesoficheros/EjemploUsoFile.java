package ejemploaccesoficheros;

import java.io.File;

public class EjemploUsoFile {
	public static void main(String[] args) {
		try {
			/*File f = new File("C:\\Temp", "ejemplosStream\\Prueba");
			f.mkdir();
			f = new File("C:\\Temp", "ejemplosStream\\Prueba\\Prueba2\\Prueba3");
			f.mkdirs();*/
			
			File f = new File("C:\\Users\\Fernando\\Desktop\\PruebasBoletin", "ejemplosStream\\Prueba");
			f.mkdirs();
		} catch (Exception ex) {
			System.out.println("Error inesperado en la creación de los directorios");
			ex.printStackTrace();
		}
	}// main

}// class


