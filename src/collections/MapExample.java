package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> list1 = new HashMap<Integer, String>();
		list1.put(1, "Jake");
		list1.put(2, "Kuku");
		list1.put(3, "Louie");
		list1.put(4, "Jojo");
		list1.put(5, "Kuku");
		
		System.out.println("Hash Map "+list1);
		
		for(int key: list1.keySet())
		{
			System.out.println("Keyset: "+key);
			System.out.println("value is : "+list1.get(key));
		}
	}

}
