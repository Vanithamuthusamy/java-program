package july;

import java.util.Scanner;

public class divisor {
public static int sum(int N)
{
int sum=0;
for(int i=1;i<N;i++)
{
  if(N%i==0)
  {
      sum=sum+i;
  }
}
return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int N,result;
    Scanner sc = new Scanner(System.in);
    N=sc.nextInt();
    result=sum(N);
    System.out.println(result);
}

		
	}


