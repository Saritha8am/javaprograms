package day10;

public class Clock {

	private int hr,min,sec;
	
	public Clock()
	{
		
		hr=10;
		min=10;
		sec=10;
		System.out.format("Time is %02d:%02d:%02d",hr,min,sec);
		
	}
	
	public Clock(int hr)
	{
		this.hr=hr;
		System.out.format("Time is %02d:%02d:%02d",hr,min,sec);
	}
	
	public Clock(int hr,int min)
	{
		this.hr=hr;
		this.min=min;
		System.out.format("Time is %02d:%02d:%02d",hr,min,sec);
	}
	
	public Clock(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
		System.out.format("Time is %02d:%02d:%02d",hr,min,sec);
	}
}
