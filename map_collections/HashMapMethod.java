package map_collections;

import java.util.HashMap;

public class HashMapMethod {
	public static void main(String[] args) {
		HashMap Hash = new HashMap<Integer, String>();
		
		Hash.put(null,null);
		Hash.put(null,100);
		Hash.put(100,null);
		Hash.put(102,1010);
		Hash.put(101,6969);
		
		System.out.println(Hash);
	}
}
