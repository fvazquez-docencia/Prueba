package ejemploarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayEnteros= new ArrayList<>();
		arrayEnteros.add(12);
		arrayEnteros.add(32);
		arrayEnteros.add(7);
		System.out.println("Primer elemento " + arrayEnteros.get(0));
		Integer enteroReemplazado=arrayEnteros.set(2, 55);
		System.out.println("Entero reemplazado " + enteroReemplazado);
		System.out.println(arrayEnteros);
		
		System.out.println("Impresión con for");
		for(int i=0;i<arrayEnteros.size();i++)
		{
			System.out.println(arrayEnteros.get(i));
		}
		
		System.out.println("Impresión con foreach");
		for(Integer i: arrayEnteros)
		{
			System.out.println(i);
		}
		
		System.out.println("Impresión con foreach en funcional");
		arrayEnteros.forEach(
				elemento->System.out.println(elemento)
				);
		
		System.out.println("Impresión con iteradores");
		Iterator<Integer> iterador=arrayEnteros.iterator();
		while(iterador.hasNext())
		{
			System.out.println(iterador.next());
		}
	}//main

}//class


