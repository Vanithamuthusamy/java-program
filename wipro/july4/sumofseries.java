/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package july4;

import java.util.Scanner;

/**
 *
 * @author skcet
 */
public class sumofseries {
    public static void main(String[] args)
    {
        int n,x;
        double sum=0,power=0;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {  power=0;
            for(double j=1;j<=i;j++){
                power=Math.pow(x, i);
            }
            sum=sum+(power/i);
            
        }
        System.out.print(sum);
              
        
    }
    
}
