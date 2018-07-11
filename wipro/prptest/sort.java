
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author skcet
 */
public class sort {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i=0;
        n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      int l=a.length-1;
      for( i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      Arrays.sort(a);
      int k=n;
     for(i=0;i<k-1;i++)
     {
         for(int j=i+1;j<k;j++)
         {
             if(a[i]==a[j])
             {
                 for(int t=j;t<k-1;t++)
                 {
                 a[t]=a[t+1];
         
                 }
                 k--;
             }
             
             
         }
     }
        System.out.println(k);for(i=0;i<k;i++)
      {
      System.out.print(a[i]+" ");
      }
        System.out.println();
      for(i=0;i<k/2;i++)
      {
      System.out.print(a[k-1-i]+" "+a[i]+" ");
      }
      if(k+1%2!=0)
      {
       System.out.print(a[i]);
     
     }}}
