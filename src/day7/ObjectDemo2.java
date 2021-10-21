package day7;

public class ObjectDemo2 {
	
	public void greet()
	{
		System.out.println("Hello....");
	}
	
	public static ObjectDemo2 createObject()
	{
		return new ObjectDemo2();
	}

	public static void main(String[] args) {
		
		ObjectDemo2 obj1=ObjectDemo2.createObject();
		
		obj1.greet();
		
	}
	
	
}
