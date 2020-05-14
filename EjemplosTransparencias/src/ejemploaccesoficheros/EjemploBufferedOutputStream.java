package ejemploaccesoficheros;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploBufferedOutputStream {

	public static void main(String[] args) {
		FileOutputStream fos;
		BufferedOutputStream bos;
		try {
			String path = "C:\\Temp\\ejemplosStream\\ficheroBos.bin";
			fos = new FileOutputStream(path);
			bos= new BufferedOutputStream(fos);
			bos.write("Prueba de escritura en BufferedOutputStream".getBytes());
			bos.flush();
			bos.close();
			fos.close();
		} catch (FileNotFoundException ex) {
			System.out.printf("\nHa ocurrido un error. No se ha encontrado el fichero:\n%s", ex.getMessage());
		} catch (IOException ex) {
			System.out.printf("\nHa ocurrido una excepción indeterminada:\n%s", ex.getMessage());
		}
	}//main

}//EjemploBufferedOutputStream


