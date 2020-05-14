package ejemploarraylist;

import java.util.ArrayList;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class EjemploArrayListMultidimensional {
	public static void main(String[] args) {
		ArrayList<ArrayList<ArrayList>> arrayMulti= new ArrayList<>();
		arrayMulti.add(new ArrayList<>());
		arrayMulti.add(new ArrayList<>());
		arrayMulti.get(0).add(new ArrayList<>());
		arrayMulti.get(0).add(new ArrayList<>());
		arrayMulti.get(1).add(new ArrayList<>());
		arrayMulti.get(1).add(new ArrayList<>());
		arrayMulti.get(1).add(new ArrayList<>());
		arrayMulti.get(0).get(0).add("cadena1");
		arrayMulti.get(0).get(1).add(true);
		arrayMulti.get(1).get(0).add("cadena2");
		arrayMulti.get(1).get(1).add(123);
		arrayMulti.get(1).get(2).add('Ç');
		
		System.out.println(arrayMulti);
	}//main

}//class




