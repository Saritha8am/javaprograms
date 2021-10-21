package day6;

public class MethodsDemo1 {
	
	
	public int sumOfNatural(int n)
	{
		
		int sum=n*(n+1)/2;
		
		return sum;
		
		
	}
	
	
	public void greet()
	{
		System.out.println("Hello..Good Morning ..");
	}
	
	public static void main(String[] args) {
		
		MethodsDemo1 obj1=new MethodsDemo1();
		
		int sum1=obj1.sumOfNatural(100);
		
		System.out.println(sum1);
		
		obj1.greet();
		
	}

}
