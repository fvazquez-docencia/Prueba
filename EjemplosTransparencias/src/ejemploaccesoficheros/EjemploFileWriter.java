package ejemploaccesoficheros;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {

	public static void main(String[] args) {
		FileWriter fw;
		try {
			String path="C:\\Temp\\ejemplosStream\\fichero22.txt";
			fw= new FileWriter(path);
			fw.write("Prueba de escritura\n en fichero de texto");
			fw.flush();
			fw.close();
		}
		catch(FileNotFoundException ex){
			System.out.printf("\nHa ocurrido un error. No se ha encontrado el fichero:\n%s",ex.getMessage());
		}
		catch(IOException ex){
			System.out.printf("\nHa ocurrido una excepción indeterminada:\n%s",ex.getMessage());
		}
	}//main

}//class
