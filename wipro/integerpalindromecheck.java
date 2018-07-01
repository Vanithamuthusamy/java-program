
import java.util.Scanner;
public class palindrome {
    public static int palindromecheck(String s)
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
					return 1;
				}
				a[count][0]=arr[i];
				a[count++][1]=arr[s.length()-i-1];
			}
		}
		switch(count)
		{
		case 0:
		return 2;
		case 1:
			 char mid=arr[i];
			if(s.length()%2!=0&&(mid==a[0][0]||mid==a[0][1]))
			{
				return 2;
			}
		case 2:
		   if((a[0][0]==a[1][0] && a[0][1]==a[1][1] )||(a[0][0]==a[1][1] && a[0][1]==a[1][0]))
			{
				return 2;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.next();
		int x=palindromecheck(s);
		System.out.println(x);
		

	}

}
    

