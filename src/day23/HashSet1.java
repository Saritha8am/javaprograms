package day23;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		
		System.out.println(hs.add("India"));
		
		System.out.println(hs.add("usa"));
		
		System.out.println(hs.add("china"));
		System.out.println("++++++++++++++++++++++++");
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			
			System.out.println("Before Cursor Move"+it.hasNext());
			
			System.out.println(it.next());
			
			System.out.println("After Cursor Move"+it.hasNext());
			
			
		}

	}

}
