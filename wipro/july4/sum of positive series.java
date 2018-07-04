/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package july4;

import java.util.Scanner;

/**
 *
 * @author Vanitha
 */
public class July4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
    
        int n,x,fact1=1,fact2=1,k,j;
        double power=0,sum=0;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {  
          
                power=Math.pow(x, i);
           
            
            for(int f1=i;f1>=1;f1--)
            {
                fact1=fact1*f1;
            }
            sum=sum+(power/fact1);
          
            fact1=1;
         
            
        }
        
        System.out.println(sum);
    }}
    

    
    

