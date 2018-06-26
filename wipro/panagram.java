package panagram;
import java.util.Scanner;
public class panagram1 {
private static Scanner sc;
		public static void main(String[] args)
		{
			String s,s1;
			int n=97,count=0,flag=0;
			sc = new Scanner(System.in);
			s= sc.nextLine();
			s1=s.toLowerCase();
			char []arr=s1.toCharArray();		
				while(n<=122) 
				{
				count=0;
				for(int i=0;i<arr.length;i++)
				{	
				if(n==(int)arr[i])
					count++;}
				if(count!=0)
				{
					flag++;
				}
				n++;
				}
			if(flag==26)
				System.out.println("panagram");
			else
				System.out.println(" not panagram");
			
		}

	}


