
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vanitha
 */
public class frequentdigit {

   
     public static void main(String[] args)
    {
      int i1[]=new int[100];

      int max=0,maxelement=0,temp=0;
      int digit,k;
        Scanner sc= new Scanner(System.in);
        k=sc.nextInt();
       for(int i=0;i<k;i++)
       {
          i1[i]=sc.nextInt();
       }
  
     for(int i=0;i<k;i++){
         int count=1;
         for(int j=i+1;j<k;j++)
         {
             if(i1[j]==i1[i])
             {
                 count++;    
            if(count>max) 
            { 
               max=count;
               temp=i1[j];
               if(temp> maxelement)
                maxelement=temp;
               
            }}
           
                  
         
         }}
           System.out.println(maxelement);
         
                 
      
    }


    }
    

