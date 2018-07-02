/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task10;

import java.util.Scanner;


public class Task10 {
    public static void main(String[] args) {
        
      int N;
      String s=" ";
      Scanner sc=new Scanner(System.in);
      N=sc.nextInt();
      if(N<=7){
      for(int i=1;i<=N;i++)
      {
       if(i%2!=0)
       {
           s+=1;
       }
       else if(i%4==0)
       {
            s+=3;
        }
       else
           {
            s+=2;
           }
      }
      System.out.println(s);
    }
      else
      {
          System.out.println("Good number cannot be generated");
      }
    
}}
