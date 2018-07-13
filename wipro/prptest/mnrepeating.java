package july13;

import java.util.Scanner;

public class mnrepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      
	      Scanner sc=new Scanner(System.in);
	      int a=sc.nextInt();
	      int b=sc.nextInt();
	      int count=sc.nextInt();
	      int k=0,value=0;
	      String m="";
	      m=m+a;
	      String n="";
	      n=n+b;
	      String s="";
	      String t="";
	      while(count>0)
	      {
	          k=k+1;
	         s=s+k;
	       
	        char c3[]=s.toCharArray();
	         int l=c3.length;
	      
	       for(int i=0;i<l;i++)
	       { 
	    	   t=t+c3[i];
	       
	           if(t.equals(m)||t.equals(n))
	            {
	              value=value+1;  
	            }
	          
	           t="";
	        }
	       if(value==l)
	        {
	            System.out.print(k+" ");
	        }
          
	       
	       value=0;
	        s="";	
	        count--;
	      }
	    

	}

}
