/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package july4;

import java.util.Scanner;

public class July4 {

    public static void main(String[] args) {
        int n,x,fact1=1,fact2=1,k,j;
        double oddsum=0,evensum=0,power=0,power1=0,seriessum=0;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {  
        if(i%2!=0)
        {
             power=Math.pow(x, i);
             for(int f1=i;f1>=1;f1--)
            {
                fact1=fact1*f1;
            }
            oddsum=oddsum+(power/fact1);
           
            fact1=1;
         
            
        }
        else{
             power1=Math.pow(x, i);
             for(int f2=i;f2>=1;f2--)
            {
                fact2=fact2*f2;
            }
           evensum=evensum+(power1/fact2);
           fact2=1;
         
                     
        }
        }
        
        seriessum=oddsum-evensum;
        System.out.println(seriessum);
    }}
    

    
    

