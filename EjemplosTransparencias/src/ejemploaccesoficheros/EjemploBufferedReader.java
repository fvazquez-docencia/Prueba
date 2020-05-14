package ejemploaccesoficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploBufferedReader {
	public static void main(String[] args) {
		FileReader fr;
		BufferedReader br;
		try {
			String linea;
			String path="C:\\Temp\\ejemplosStream\\ficheroBufferedReader.txt";
			fr= new FileReader(path);
			br = new BufferedReader(fr);
			System.out.println("Contenido del fichero:");
			while((linea=br.readLine())!=null){
				System.out.println(linea);
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
}//class


