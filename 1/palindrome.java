/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num,rem,rev=0,sum=0,temp;
		Scanner b= new Scanner(System.in);
		num=b.nextInt();
	            temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev){
		System.out.println("yes it is a palindrome");
		}
		else
		System.out.println("Not a palindrome");
	}
}
