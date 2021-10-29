package day12;

public  class  Demo extends Sample{

	
	public void greet(String str) {
		
		switch(str)
		{
			case "Morning": 
				System.out.println("Good Morning ...");
				return;
			case "Afternoon":
				System.out.println("Good Afernoon ...");
				return;
				
			default :
				
				System.out.println("Proper Time is not mentioned ");
		}		
				
		
	}

	@Override
	public void bye() {
		
		
	}

}
