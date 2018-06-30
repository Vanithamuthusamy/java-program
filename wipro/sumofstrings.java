
import java.util.Scanner;
public class sum {
    public static String integersum(char c1[],char c2[])
    {
          String s3=" ",s4=" ";  
          int sum=0,n,carry=0;
          for(int i=c1.length-1;i>=0;i--)
                {
                            
                    n=Character.getNumericValue(c1[i])+Character.getNumericValue(c2[i])+carry;
                    sum=n%10;
                    carry=n/10;
                    s3=s3+sum;
                        
                }
           for(int i=s3.length()-1;i>=0;i--){
                 s4=s4+s3.charAt(i);
    }
           return s4;
}
    public static void main(String[] args)
    {
    String s1,s2,result;
		int l1,l2,diff,n1,carry=0;
		Scanner sc= new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		l1=s1.length();
                l2=s2.length();
                if(l1<l2)
                {
                    diff=l2-l1;
                    for(int i=0;i<diff;i++)
                    {
                        s1=0+s1;
                 
                    }
                  
                }
                else if(l2<l1)
                {
                     diff=l1-l2;
                    for(int i=0;i<diff;i++)
                    {
                        s2=0+s2;
                    }
                }
                char c1[]=s1.toCharArray();
                char c2[]=s2.toCharArray();
                result=integersum(c1,c2);
                System.out.println(result);
}
}
