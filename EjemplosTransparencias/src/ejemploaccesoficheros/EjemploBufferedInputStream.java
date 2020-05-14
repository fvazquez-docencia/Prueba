package ejemploaccesoficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemploBufferedInputStream {

	public static void main(String[] args) {
		FileInputStream fis;
		BufferedInputStream bis;
		try {
			int dato;
			String path="C:\\Temp\\ejemplosStream\\ficheroBos.bin";
			fis= new FileInputStream(path);
			bis= new BufferedInputStream(fis);
			System.out.println("Contenido del fichero:");
			while(bis.available()>0){
				System.out.print((char)bis.read());
			}
			bis.close();
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


