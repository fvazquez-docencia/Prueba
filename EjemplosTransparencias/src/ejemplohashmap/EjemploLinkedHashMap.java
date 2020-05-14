package ejemplohashmap;

import java.util.LinkedHashMap;

public class EjemploLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm= new LinkedHashMap<>();
		lhm.put(1, "1");
		lhm.put(3, "3");
		lhm.put(4, "4");
		lhm.put(2, "2");
		lhm.put(5, "5");
		lhm.put(1, "11");
		System.out.println(lhm.values());
	}//main

}//EjemploLinkedHashMap

