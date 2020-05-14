package ejemplohashmap;

import java.util.HashMap;

public class EjemploHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<>();
		hm.put(1, "1");
		hm.put(3, "3");
		hm.put(4, "4");
		hm.put(2, "2");
		hm.put(5, "5");
		System.out.println(hm.values());
		}//main

}//class
