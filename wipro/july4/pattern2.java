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
public class pattern2 {
    public static void main(String[] args)
    {
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            for(int j=i;j<=N;j++)
            {
              System.out.print(j);
            }
            for(int k=1;k<i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
                
                }
    }
    
}
