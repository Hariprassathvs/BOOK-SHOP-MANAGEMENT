import mypack.*;//package
import java.util.*;  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;   
import java.util.Scanner;
class location extends Exception
{
	
}
public class bookshop5
{
	String name;
	String typeofthebook;
	int bookid;
	manager Manager; //AGGREGATION 
	protected String shopename;
	bookshop5(String bkname)
	{
		shopename=bkname;
	}
	bookshop5(String name,String phno,int v,manager Manager)
	{
			this.name=name;
			this.typeofthebook=typeofthebook;
			bookid=v;
			this.Manager=Manager;
	}
	public void getbookid()
	{
		try
		{
		if(bookid==1)
		{
			System.out.println("Sherlock Holmes");
		}
		else if(bookid==2)
		{
			System.out.println("James Bond");
		}
		else
		{
			throw new location();
		
		}
		}
		catch (location e)
		{
			System.out.println("WRONG INPUT");
			e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		String name;
		String typeofthebook;
		int v;
		manager Manager = new manager("roy","man25252");
		Scanner sc=new Scanner(System.in);
		register.intro s1 = new register.intro();    
		register obj[] = new register[1];
		register.change();                
		s1.show();
		obj[0]=new register(args[0],1988542); //Command line argument
		System.out.println("************************************************");
		System.out.println("Enter ur name");
		name=sc.nextLine();
                System.out.println("Enter type of the book");
		typeofthebook=sc.nextLine();
		System.out.println("Enter ur phoneno");
		Scanner s=new Scanner(System.in);
		int n=10;
		String a[]=new String[n];
		try
		{

		int i;
		for (i=0;i<n;i++);
		{
			a[i]=s.nextLine();
		}
		}
		catch(ArrayIndexOutOfBoundsException z)
		{
			System.out.println("ARRAY OUT OF BOUND");
		}
		
		System.out.println("Enter 1 for Sherlock Holmes && Enter 2 for  James Bond");
		v=sc.nextInt();
		bookshop5 br= new bookshop5(name,typeofthebook,v,Manager);
		br.getbookid();
		System.out.println("************************************************");
		obj[0].display("online");
		System.out.println("Manager Name: "+br.Manager.manname);
		System.out.println("Manager ID: "+br.Manager.managerID);
		System.out.println("***********************LAB 5*******************************");
		long startTime = System.currentTimeMillis();
		stringbuffer obj2=new stringbuffer();
		obj2.concatwithstring();
		System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms"); //string time
		startTime = System.currentTimeMillis();
		obj2.concatwithstringbuffer();
		System.out.println("Time taken by Concating with StringBuffer class: "+(System.currentTimeMillis()-startTime)+"ms"); //string buffer time
		System.out.println("*************************INTERFACE************");
		int c1;
		System.out.println("ENTER 1 For TAMILNADU && ENTER 2 For KARNATAKA");
		c1=sc.nextInt();
		details det=new details(c1);
		det.state();
		det.country();
	}
}

class register extends bookshop5      
{
	static String registerman = "joy";       
	static void change()              
	{
		registerman="prassath";
	}
	static 
	{ 
		System.out.println(".......HAI.............");
	}     
	register(String bkname, int registerid)
	{
		super(bkname);
		int regid=registerid;
	}
	register(String bkname, int registerid, int password)    
	{
		super(bkname);
		int p=password;
		int regid= registerid;
	}
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	void display()
	{
		System.out.println(shopename);
		System.out.println(dtf.format(now));
	}
	void display(String mode)              
	{
		System.out.println("\n"+"Registerman in charge : "+registerman+"\n"+"shope Name : "+shopename);
		System.out.println(dtf.format(now));
		System.out.println("Booked by : "+mode);
	}
	static class intro     
	{
		void show()
		{
			System.out.println(" WELCOME TO ROYAL BOOK SHOP");
		}
	}
}
class manager  //Aggregation
{
  
  String manname;
  String managerID;
  
  manager(String manname, String managerID) {
    this.manname = manname;
    this.managerID = managerID;
  }
}
interface nationality //Interface
{
	public void state(); 
	public void country(); 
}
class details implements nationality 
{
	int opt;
	details(int c1)
	{
		opt=c1;
	}
	public void state() 
	{
		if(opt==1)
		{
			System.out.println("State is TAMILNADU");
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
