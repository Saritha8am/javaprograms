package day10;

public class DateOfTheDay {
	
	
	int date,month,year;
	
	public void setDate(int date,int month,int year)
	{
		
		this.date=date;
		this.month=month;
		this.year=year;
	}
	
	public void getDate()
	{
		String mon=null;
		
		if(month==1)
		{
			mon="JAN";
			
		}
		else if(month==2)
		{
			mon="FEB";
		}
		
		System.out.printf("Date is %02d-%s-%02d",date,mon,year);
		
	}

}
