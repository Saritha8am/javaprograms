package day8;

public class Clock {

	private int hr,min,sec;
	
	public void setClock(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	
	public void getClock()
	{
		System.out.println(hr+":"+min+":"+sec);
	}
	
	
}
