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
public class factorial {
    public static void main(String[] args)
    {
        int N,sum=0,f=1,a;
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        for(int i=N;i>=1;i--)
        {f=1;
            for(int j=i;j>=1;j--)
            {
                a=f*j;
                f=a;
            }
            sum=sum+f;
        }
        System.out.println(sum);
    }
    
}
