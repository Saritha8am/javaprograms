package day5;

public class DataTypeDemo {

	boolean b1;
	
	public static void main(String[] args) {
		
		
		byte b=-128;
		
		short s=-129;
		
		byte c=+126;
		
		System.out.println(b+c);
		
		char c1='a';
		char c2=97;
		
		System.out.println(c1);
		System.out.println(c2);
		
		String str="malayalam";
		
		char[] c3=str.toCharArray();
		
		for(char x:c3)
		{
		//	System.out.println(x);
		}
		
		
		DataTypeDemo obj1=new DataTypeDemo();
		
		System.out.println(obj1.b1);
		
		
		
		
		
		

	}

}
