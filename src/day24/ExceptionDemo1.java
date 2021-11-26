package day24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please Enter value of x ");
		int x=sc.nextInt();
		System.out.println();
		
		System.out.print("Please Enter value of y ");
	
		int y=sc.nextInt();
		Thread.sleep(2000);
		System.out.println();
		
		
		try
		{
		System.out.println("Quotient is "+(x/y));
		int z=sc.nextInt();
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			
			System.err.println(e.getMessage());
			System.out.println("PLease enter non zero value for y");
		}
		catch(InputMismatchException ie)
		{
			System.out.println(ie.getMessage());
			System.out.println("Please Inter int values only");
		}
		
		
		System.out.println("End of Program");

	}

}
