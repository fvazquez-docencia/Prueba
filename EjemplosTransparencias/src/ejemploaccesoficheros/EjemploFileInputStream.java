package ejemploaccesoficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemploFileInputStream {
	public static void main(String[] args) {
		FileInputStream fis;
		try {
			int dato;
			String path="C:\\Temp\\ejemplosStream\\fichero.bin";
			fis= new FileInputStream(path);
			System.out.println("Contenido del fichero:");
			while((dato=fis.read())!=-1){
				System.out.print((char)dato);
			}
			fis.close();
		}
		catch(FileNotFoundException ex){
			System.out.printf("\nHa ocurrido un error. No se ha encontrado el fichero:\n%s",ex.getMessage());
		}
		catch(IOException ex){
			System.out.printf("\nHa ocurrido una excepción indeterminada:\n%s",ex.getMessage());
		}
	}//main
}//class




