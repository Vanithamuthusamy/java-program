import java.util.Scanner;
public class secondlarge {
    public static int largest(String s)
    {
       char c[]=s.toCharArray();
        int max=0,n[]=new int[c.length],temp=0;
        for(int i=0;i<c.length;i++)
        {
         n[i]=Character.getNumericValue(c[i]);  
        }
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++){
            if(n[i]<n[j])
            {
                temp=n[i];
                n[i]=n[j];
                n[j]=temp;
            }  
        }}
        int x=n[1];
         return x;
    }
    public static void main(String[] args)
    {
        String s;
        int x;
        Scanner sc =new Scanner(System.in);
        s=sc.next();
       x=largest(s);
       System.out.println(x);
    }
    
}
