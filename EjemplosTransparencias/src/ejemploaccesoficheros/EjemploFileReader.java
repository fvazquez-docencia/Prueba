package ejemploaccesoficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFileReader {

	public static void main(String[] args) {
		FileReader fr;
		try {
			int dato;
			String path="C:\\Temp\\ejemplosStream\\fichero.txt";
			fr= new FileReader(path);
			System.out.println("Contenido del fichero:");
			while((dato=fr.read())!=-1){
				System.out.print((char)dato);
			}
			fr.close();
		}
		catch(FileNotFoundException ex){
			System.out.printf("\nHa ocurrido un error. No se ha encontrado el fichero:\n%s",ex.getMessage());
		}
		catch(IOException ex){
			System.out.printf("\nHa ocurrido una excepción indeterminada:\n%s",ex.getMessage());
		}
	}//main

}
