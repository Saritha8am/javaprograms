package day23;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		
		System.out.println(hs.add("India"));
		
		System.out.println(hs.add("usa"));
		
		System.out.println(hs.add("china"));
		System.out.println("++++++++++++++++++++++++");
		
		
		for(String a:hs)
		{
			System.out.println(a);
		}

	}

}
