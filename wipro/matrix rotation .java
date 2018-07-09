/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package july9;

import java.util.Scanner;

/**
 *
 * @author Vanitha
 */
public class matrixrotate {
   public static void main(String[] args)
   {int m,n;
   Scanner sc=new Scanner(System.in);
   m=sc.nextInt();
   n=sc.nextInt();
       int a[][]=new int[m][n];
       int b[][]=new int[n][m];
       for(int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++)
           {
               a[i][j]=sc.nextInt();
           }
       }
       for(int i=0;i<m;i++)
       {int k=m-1;
           for(int j=0;j<n;j++)
           {
            b[k][i]=a[i][j];
            k--;
           }
         
       }
       for(int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++)
           {
            System.out.print(b[i][j]+" ");
           }
          System.out.println();
       }
   }
}
