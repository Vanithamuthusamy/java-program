/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package july;

import java.util.Scanner;

/**
 *
 * @author skcet
 */
public class July {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s,exp="";
        int x=0,y=0;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            
            if(Character.isDigit(ch[i]))
            {
              exp+=ch[i]; 
                
            }
            else if(!Character.isDigit(ch[i])&&ch[i]!='=')
            {
                x=Integer.parseInt(exp);
                exp="";
                continue;
                
            }
            else if(ch[i]=='=')
            {
                y=Integer.parseInt(exp);
                exp="";
            }
                
        }
        int z=Integer.parseInt(exp);
        if(x+y==z)
        {
            System.out.println("+");
        }
        else if(x-y==z)
        {
            System.out.println("-");
        }
        else if(x*y==z)
        {
            System.out.println("*");
        }
        else if(x/y==z)
        {
            System.out.println("/");
        }
           
    }
    
}
