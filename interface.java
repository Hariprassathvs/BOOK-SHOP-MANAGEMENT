interface nationality //Interface
{
	public void state(); 
	public void country(); 
}
class details implements nationality 
{
	int opt[]=new int[2];
	details(int c1,int c2)
	{
		opt[0]=c1;
		opt[1]=c2;
	}
	public void state() 
	{
		if(opt[0]==1)
		{
			System.out.println(" State is TAMILNADU ");
		}
		else
		{
			System.out.println("State is KARNATAKA");
		}
	}
	public void country()
	{
		System.out.println("Country -- INDIA");
	}
}
