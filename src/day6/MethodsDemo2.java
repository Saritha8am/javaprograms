package day6;

public class MethodsDemo2 {
	
	
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
		
		
		int sum1=new MethodsDemo2().sumOfNatural(200);
		
		System.out.println(sum1);
	}

}
