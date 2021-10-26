package day10;

public class Student {
	
	
	int rollNo;
	String sNa;
	
	public void setData(int rollNo,String sNa)
	{
		this.rollNo=rollNo;
		this.sNa=sNa;
		
	}
	
	public void getData()
	{
		System.out.println("Roll no "+rollNo);
		System.out.println("Student name "+sNa);
	}

}
