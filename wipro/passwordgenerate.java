
import java.util.Scanner;
public class pin {
    public static String password(String s1,String s2, String s3){
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();  
        char c3[]=s3.toCharArray();
        String s="";
        int key[]=new int[10];
        int max=0,temp=0;
        for(int i=(c3.length)-1;i>=0;i--)
        {
           int n1=Character.getNumericValue(c1[i]);
           int n2=Character.getNumericValue(c2[i]);
           int n3=Character.getNumericValue(c3[i]);
           int m1,m2,m3;
           m1=n1;
           m2=n2;
           m3=n3;
           if(n1<=n2&&n1<=n3)
           {
               key[i]=n1;
               
           }
           else if (n2<=n3)
           {
               key[i]=n2;
           }
           else{
               key[i]=n3;
            }
         
           if(m1>=m2&&m1>=m3)
           {
               max=m1;
               
           }
           else if (m2>=m3)
           {
               max=m2;
           }
           else
           {
               max=m3;
           }
           if(max>=temp)
           {
              temp=max ;
           }
           
            s=key[i]+s;
           
            
           
    }
        s=temp+s;
        return s;
    }
    public static void main(String[] args)
    { String key;
        String s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        s1=sc.next();
        s2=sc.next();
        s3=sc.next();
        key=password(s1,s2,s3);
        System.out.print(key);
    }
}
