package july;

import java.util.Scanner;

public class pattern1 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N,k=1;
		sc = new Scanner(System.in);
		N=sc.nextInt();
		int n=N;
       for(int i=N;i>0;i--)
       {
    	   k=N-(i-1);
    	   n=N;
    	  for(int j=i;j>0;j--)
    	  { 
    		System.out.print(k+" ");
           k=k+n;
           n--;
    	  }
    	  System.out.println();
       }
		
	}

}
