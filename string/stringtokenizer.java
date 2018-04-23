/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
String address1 = " Mr.Jack,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
String address2 = " Ms Jill,Door No 53,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
String address3 = " Mr Holmes,Door No 13,Valmiki Street,32d Main Road,Saidapet,Chennai,Pin-600115";
String address4 = " Mr.Davinci,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
StringTokenizer st1=new StringTokenizer(address1,"Mason Street");
StringTokenizer st2=new StringTokenizer(address2,"Mason Street");
StringTokenizer st3=new StringTokenizer(address3);
StringTokenizer st4=new StringTokenizer(address4,"Mason Street");
//StringTokenizer st5=new StringTokenizer(address);//
System.out.print("Names are:"+st1.nextToken(",")+st2.nextToken(",")+st3.nextToken(",")+st4.nextToken(","));
System.out.println("\n");
while(st1.hasMoreTokens())
{
System.out.println(st1.nextToken());	
	}
System.out.println("\n");
	while(st2.hasMoreTokens())
{
System.out.println(st2.nextToken());	
	}
System.out.println("\n");
while(st4.hasMoreTokens())
{
System.out.println(st4.nextToken());	
	}
  }
  }
	
	
}
}
