package mypack;
public class stringbuffer
{
public static String concatwithstring() //string class
	{
		String shopid="17041414";
		System.out.println("Booking SHOP ID : " + shopid);
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
		System.out.println("Length of string  shop  id =" + p);
		for (int i=0;i<1000;i++)
		{
			sb.append("shopid");
		}
		return sb.toString();
	}
}
