package day11;

public class MethodOverdingDemo {

	
	public static void main(String[] args) {
		
		
		Marks s1=new Marks();
		
		//Student s1=new Student();
		s1.setData(1, "Ram");
		s1.setMarks(80, 90, 70);
		s1.getData();
		s1.getResults();
		
		
	}
}
