/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package july24;

import java.util.Scanner;

/**
 *
 * @author guest-zmnkug
 */
public class July24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String R="",NR="";
        int i1=sc.nextInt();
        int i2=sc.nextInt();
        int flag=0,flag1=0;
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        for(int i=0;i<c1.length;i++)
        {
            for(int j=0;j<c2.length;j++)
            {
                if(c1[i]==c2[j])
                {
                
                  flag++;
                 
                }
                
                 
            }
            if(flag!=0)
            {
                R=R+c1[i];
            }
            else
            {
                NR=NR+c1[i];
            }
            flag=0;
            
        }
        for(int i=0;i<c2.length;i++)
        {
            for(int j=0;j<c1.length;j++)
            {
                if(c2[i]==c1[j])
                {
                
                  flag1++;
                 
                }
                
                
                 
            }
            
             if(flag1!=0)
            {
                R=R+c2[i];
            }
            else
            {
             NR=NR+c2[i];
            }
            
            
            
            flag1=0;
            
        }
        if(i1==0)
        {
            if(i2==0)
                System.out.println(NR.toUpperCase());
            else
                System.out.println(NR.toLowerCase());
        }
        else 
        {
            if(i2==0)
                System.out.println(R.toUpperCase());
            else
                System.out.println(R.toLowerCase());
        }
       
    
}}
