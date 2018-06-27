
package javaapplication6;

import java.util.Scanner;

public class password {
    public static void main(String[] args)
    {
        String password;
        Scanner sc=new Scanner(System.in);
        int upper=0,lower=0,special=0;
                password=sc.next();
                 char arr[] = password.toCharArray();
                for(int i=0;arr.length>i;i++)
                {
                    int ch=(int)arr[i];
                    if(ch>=65&&ch<=90)
                    {
                        upper++;
                    }
                    else if(ch<=122&&ch>=97)
                    {
                      lower++;  
                    }
                     else if(ch==33||ch==64||ch==45||(ch>=35&&ch<=38)||(ch>=40&&ch<=43))
                             {
                        special++;
                }}
                if(upper!=0&&lower!=0&&special!=0&&arr.length==8)
                {
                    System.out.println("Strong");
                }
                else 
                     System.out.println("Moderate"); 
                    
                
    }
    
}
