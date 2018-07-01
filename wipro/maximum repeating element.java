

import java.util.Scanner;
public class frequentdigit
{

  public static void main(String[] args)
    {
      int i1[]=new int[100];
      String s1;
      int max=0,maxelement=0,temp=0;
      int digit,k;
      Scanner sc= new Scanner(System.in);
      s1=sc.next();
      k=s1.length();
      char c1[]=s1.toCharArray();
      for(int i=0;i<k;i++)
       {
          i1[i]=Character.getNumericValue(c1[i]);
       }
      for(int i=0;i<k;i++)
      {
         int count=1;
         for(int j=i+1;j<k;j++)
         {
             if(i1[j]==i1[i])
                 count++;    
            if(count>max) 
            { 
               max=count;
               maxelement=i1[j];   
            }
            else if (count==max)
            {
                if(i1[j]>maxelement)
                {
                    maxelement=i1[j];
                }
            }
         }
       }
           System.out.println(maxelement);
         
    }
}


    
    

