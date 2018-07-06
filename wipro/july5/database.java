/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package july6;

import java.util.Scanner;

/**
 *
 * @author skcet
 */
public class July6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N,temp,a=0,b=0,c=0,count=0;
        
        Scanner sc =new Scanner(System.in);
        N=sc.nextInt();
        String []s1=new String[N];
        String name;
        int id[]=new int[N];
        for(int i=0;i<N;i++)
        {
           s1[i]=sc.next();
                   
        }
        for(int i=0;i<N;i++)
        {
           id[i]=sc.nextInt();
                   
        }
        
        
        for(int i=0;i<N;i++)
        {
          
           for(int j=i+1;j<N;j++)
           {
               if(id[i]>id[j])
               {
                   temp=id[i];name=s1[i];
                   
                   id[i]=id[j];s1[i]=s1[j];
                   id[j]=temp;s1[j]=name;
               }
           }}
           for( int i=0;i<N-2;i++)
           { count=0;
               for(int j=i+1;j<i+3;j++)
               {
                   if(id[i]+1==id[j]||id[i]+2==id[j])
                   {
                       count++;
                   }
               }
           
               if(count==2)
               {
                  System.out.println(s1[i]+s1[i+1]+s1[i+2]);
                  break;
               }
           }
         
    
    }
    
}


