

import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int min,max,n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int a[]=new int[n];

	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	max=a[0];
	min=a[0];
	for(int i=0;i<n;i++)
	{
		if(min>a[i])
		{
			min=a[i];
		}
	}
	System.out.println("minimum:"+min);
	
		for(int i=0;i<n;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
	}
	System.out.println("maximum:"+max);
	}
}
