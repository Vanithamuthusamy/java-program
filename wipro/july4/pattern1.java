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
public class July4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int N,k;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        k=N;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<k;j++)
            {
                System.out.print(k);
            }
            for(int l=0;l<i*2;l++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=k;j++)
            {
                System.out.print(k);
            }
            System.out.println();
            k--;
           
        }
        
    }
    
}
