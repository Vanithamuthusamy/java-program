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
public class July9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N,count=0;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        String s=String.valueOf(N);
        char c[]=s.toCharArray();
        int l=s.length();
        String end="1";
        String j="";
        for(int i=0;i<l;i++)
        {
            end+=0;
        }
        int e=Integer.parseInt(end);
        for(int i=N+1;i<e;i++)
        {
             j=String.valueOf(i);
            count=0;
            for( int k=0;k<j.length();k++)
            {
               char p=c[k];
                if(j.contains(String.valueOf(p)))
                {
                    count++;
                }
            }
            if(count==l)
            {
                System.out.println(j);
               break;
            }
            
        
    }}}
    

