package ejemploset;

import java.util.HashSet;
import java.util.Iterator;

public class EjemploHashSet {
	public static void main(String[] args) {
		//HashSet
		HashSet<String> setNombres= new HashSet<>();
		setNombres.add("Juan");
		setNombres.add("Luis");
		setNombres.add("Gabriela");
		setNombres.add(null);
		setNombres.add("David");
		
		//Recorrer HashSet
		Iterator<String> it=setNombres.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Imprimir el conjunto entero
		System.out.println(setNombres);
	}//main
}//class
