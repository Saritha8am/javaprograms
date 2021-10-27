package day10;

public class Leave extends Marks {

	
	int noSL,noCL;
	
	public void setLeaves(int noSL,int noCL)
	{
		this.noCL=noCL;
		this.noSL=noSL;		
	}
	
	public void getLeaves()
	{
		
		System.out.println("NO of Leaves "+(noSL+noCL));
	}
}
