package ejemploset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class EjemploLinkedHashSet {
	public static void main(String[] args) {
		//LinkedHashSet
		LinkedHashSet<String> setNombres= new LinkedHashSet<>();
		setNombres.add("Juan");
		setNombres.add("Luis");
		setNombres.add("Gabriela");
		setNombres.add(null);
		setNombres.add("David");
		
		//Recorrer LinkedHashSet
		Iterator<String> it=setNombres.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Imprimir el conjunto entero
		System.out.println(setNombres);
	}//main
}//class
