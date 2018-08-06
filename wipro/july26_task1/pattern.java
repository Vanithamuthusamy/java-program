
package task1july26;

import java.util.Scanner;

public class Task1july26 {

   
    public static void main(String[] args) {
       
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=2,m=2,count=1;
        
        for(int i=n;i>=1;i--)
        {if(i==n){
          for(int j=1;j<=i;j++)
          {
              System.out.print(j);
          }
          System.out.println();
        }
        else{
            for(int k=1;k<=count;k++)
            {
               System.out.print(m);
               m--;
               
            }
            count++;
            n1=n1+1;
            m=n1;
            for(int p=1;p<=i;p++)
          {
              System.out.print(p);
          }
              System.out.println();
            
        }
        
    }
        }
