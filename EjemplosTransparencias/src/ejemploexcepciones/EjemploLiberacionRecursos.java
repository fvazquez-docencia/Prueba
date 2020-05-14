package ejemploexcepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjemploLiberacionRecursos {
	
	// Liberación de un fichero tras usarlo
	//Con try-with-resources
	public static String leerPrimeraLinea(String path) throws IOException {
	    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
	        return br.readLine();
	    }
	}//leerPrimeraLinea
	
	//con try-finally
	public static String leerPrimeraLineaConFinally(String path) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(path));
	    try {
	        return br.readLine();        
	    } finally {
	        if (br != null) br.close();
	    }
	}//leerPrimeraLineaConFinally

}//class


