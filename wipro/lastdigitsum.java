
import java.util.Scanner;
public class lastdigitsum {

public static int addLastDigits(int n3,int n4)
{
    int total;
    total=n3+n4;
    return total;
}
    public static void main(String[] args) 
    {
        int n1,n2,n3=0,n4=0,sum;
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        if(n1<0&&n2>=0)
        {
            n1=n1*-1;
        }
        else if(n1>=0&&n2<0)
        {
            n2=n2*-1;
        }
        else if(n1<0&&n2<0)
        {
            n1=n1*-1;
            n2=n2*-1;
        }
    n3=n1%10;
    n4=n2%10;
    sum=addLastDigits(n3,n4);
    System.out.println(sum);
    
}}


