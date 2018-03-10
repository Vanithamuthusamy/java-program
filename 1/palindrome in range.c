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
		int i,n1,n2,rem,rev=0,sum=0,temp;
		Scanner b= new Scanner(System.in);
		n1=b.nextInt();
			n2=b.nextInt();
			for(i=n1;i<n2;i++){
			
	            temp=i;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==i){
		System.out.println(rev);
		
	}
		rev=0;
}}}
