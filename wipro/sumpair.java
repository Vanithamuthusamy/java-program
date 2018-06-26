package panagram;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner in=new Scanner(System.in);
	        int N=in.nextInt();
	        int flag=0;
	        int arr[]=new int[N];
	        for(int i=0;i<N;i++)
	        {
	            arr[i]=in.nextInt();
	        }
	        int sum=in.nextInt();
	        int count=0;
	        for(int i=0;i<N;i++)
	        {
	            for(int j=i+1;j<N;j++)
	            {
	                if(sum==arr[i]+arr[j])
	                {
	                    System.out.printf("(%d,%d)",arr[i],arr[j]);
	                    count++;
	                }
	              
	        }
	        
	    }
	        if(count==0)
	        {
	        	System.out.println("-1");
	        }
	}
}


