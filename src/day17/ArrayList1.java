package day17;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		
		a.add(10);  //  a[0]=10;
		
		System.out.println(a.add(20));
		
		a.add(30);
		
		a.add(40);
		
		a.add(10);  //  a[0]=10;
		
		a.add(20);
		
	//	a.add(30.33);
		
		a.add(40);
		
		a.add(10);  //  a[0]=10;
		
		a.add(20);
		
		a.add(30);
		
		a.add(40);
		
		
		
		//System.out.println(a.get(0));
		
		/*
		 * for(int i=0;i<a.size();i++) { System.out.println(a.get(i)); }
		 * 
		 * System.out.println(a.size());
		 */
		
		Iterator<Integer> it=a.iterator();
		
		while(it.hasNext())
		{
			
			System.out.println("Before Cursor Move"+it.hasNext());
			
			System.out.println(it.next());
			
			System.out.println("After Cursor Move"+it.hasNext());
			
			
		}
		
		
		
		
		
	}

}
