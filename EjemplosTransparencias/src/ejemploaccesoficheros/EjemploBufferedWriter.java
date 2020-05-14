package ejemploaccesoficheros;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploBufferedWriter {
	public static void main(String[] args) {
		FileWriter fw;
		BufferedWriter bw;
		try {
			String path="C:\\Temp\\ejemplosStream\\ficheroBufferedReader.txt";
			fw= new FileWriter(path);
			bw = new BufferedWriter(fw);
			bw.write("Prueba de escritura");
			bw.write("\n");
			bw.write("Escritura mediante BufferedWriter");
			bw.flush();
			bw.close();
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

