package day17;

import day10.Student;

public class Arrays2 {

	public static void main(String[] args) {
		
		
		int[] arr=new int[10];
		
		arr[8]=80;
		
		//Student[] s=new Student[100];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(i+1)*100;
			
			System.out.println(arr[i]);
		}
		
		arr[10]=1100;
		
		System.out.println(arr[10]);
		
		
		/*
		 * for(int i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 */
		
		
	}

}
