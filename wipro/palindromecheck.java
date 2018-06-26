package panagram;

import java.util.Scanner;

public class palindrome {
	private static Scanner sc;

	public static boolean palindromecheck(String s)
	{
		char []arr=s.toCharArray();
		int i,count=0;
		int a[][]=new int[2][2];
		for(i=0;i<s.length()/2;i++)
		{
			if(arr[i]!=arr[s.length()-i-1])
			{
				if(count==2)
				{
					return false;
				}
				a[count][0]=arr[i];
				a[count++][1]=arr[s.length()-i-1];
			}
		}
		switch(count)
		{
		case 0:
		return true;
		case 1:
			 char mid=arr[i];
			if(s.length()%2!=0&&(mid==a[0][0]||mid==a[0][1]))
			{
				return true;
			}
		case 2:
		   if((a[0][0]==a[1][0] && a[0][1]==a[1][1] )||(a[0][0]==a[1][1] && a[0][1]==a[1][0]))
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		sc = new Scanner(System.in);
		s=sc.next();
		boolean x=palindromecheck(s);
		System.out.println(x);
		

	}

}
