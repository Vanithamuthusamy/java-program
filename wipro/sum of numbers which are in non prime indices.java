/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		   int []n=new int[7];
        int sum=10;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n.length;i++)
        {
            n[i]=sc.nextInt();   
        }
        
        for(int i=1;i<=n.length;i++)
        {
           int count=0;
          for(int j=1 ;j<=i;j++)
          {
           if(i%j==0)
               count++;
          }
          if(count!=2)
          {
          sum=sum+n[i]; 
          }
        }
        System.out.println(sum);
       
    }
    
}
