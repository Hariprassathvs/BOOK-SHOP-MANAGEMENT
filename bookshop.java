import java.util.*;  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;   
import java.util.Scanner;
public class bookshop
{
	String name;
	String phno;
	int bookid[]=new int[2];
	manager Manager; //AGGREGATION 
	protected String shopename;
	bookshop(String bkname)
	{
		shopename=bkname;
	}
	bookshop(String name,String phno,int v1,int v2,manager Manager)
	{
			this.name=name;
			this.phno=phno;
			bookid[0]=v1;
			bookid[1]=v2;
			this.Manager=Manager;
	}
	public void getbookid()
	{
		if(bookid[0]==1)
		{
			System.out.println("Sherlock Holmes");
		}
		else
		{
			System.out.println("James Bond");
		}
}
	public static String concatwithstring() //string class
	{
		String shopid="17041414";
		System.out.println("shop ID : " + shopid);
		for(int i=0;i<1000;i++)
		{
			shopid=shopid+"shopid";
		}
		return shopid;
	}
	public static String concatwithstringbuffer()  //string buffer class
	{
		StringBuffer sb=new StringBuffer("17401414");
		int p = sb.length();
		System.out.println("Length of string shop id =" + p);
		for (int i=0;i<1000;i++)
		{
			sb.append("shopid");
		}
		return sb.toString();
	}


	public static void main(String args[])
	{
		String name;
		String phno;
		int v1,v2;
		manager Manager = new manager("hari","25252");
		Scanner sc=new Scanner(System.in);
		register.intro s1 = new register.intro();    
		register obj[] = new register[1];
		register.change();                
		s1.show();
		obj[0]=new register(args[0],1988542); 
		System.out.println("************************************************");
		System.out.println("Enter ur name");
		name=sc.nextLine();
		System.out.println("Enter ur phno");
		phno=sc.nextLine();
		System.out.println("Enter 1 for Sherlock Holmes && Enter 2 for James Bond");
		v1=sc.nextInt();
		v2=sc.nextInt();
		System.out.println("************************************************");
		bookshop br= new bookshop(name,phno,v1,v2,Manager);
		br.getbookid();
		obj[0].display("online");
		System.out.println("Manager Name: "+br.Manager.managername);
		System.out.println("Manager ID: "+br.Manager.managerID);
	}
}

class register extends bookshop      
{
	static String registerman = "joy";       
	static void change()              
	{
		registerman="prashanth";
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
			System.out.println("WELCOME TO ROYAL BOOK SHOP ");
		}
	}
}
class manager //Aggregation
{
  
  String managername;
  String managerID;
  
  manager(String managername, String managerID) {
    this.managername = managername;
    this.managerID = managerID;
  }
}
