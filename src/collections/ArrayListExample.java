package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jake");
		list1.add("Kiki");
		list1.add("Jojo");
		list1.add("Juju");
		list1.add("Kuku");
		list1.add("Nicki");
		System.out.println("list is this" +list1);
		System.out.println("Size of Array" +list1.size());
		
		list1.remove(3);
		System.out.println("list is this" +list1);
		System.out.println("Size of Array" +list1.size());
		
		list1.set(2, "Louie");
		System.out.println("list is this" +list1);
		System.out.println("Size of Array" +list1.size());
		
		Collections.sort(list1);
		System.out.println("list is this" +list1);
		System.out.println("Size of Array" +list1.size());
		
		for(int i = 0; i<list1.size();i++)
		{
			if(list1.get(i).equals("Kuku"))
			{
				System.out.println("index number of Kuku is "+i);
				break;
			}
		}
	}

}
