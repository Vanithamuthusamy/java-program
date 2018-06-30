
import java.util.Scanner; 

public class weight {
    public static int vowelinclude(String s1)
    {
        char c[]=s1.toLowerCase().toCharArray();
        int sum=0;
        for(int i=0;i<s1.length();i++)
        {
         sum=sum+(int)c[i]-96;   
        }
        return sum;
    }
    public static int novowelinclude(String s1){
        char c[]=s1.toLowerCase().toCharArray();
        int sum=0;
          for(int i=0;i<c.length;i++)
         {
          if(c[i]!='a'&& c[i]!='e'&& c[i]!='i'&& c[i]!='o'&& c[i]!='u'){
          sum=sum+(int)c[i]-96;   
          }}System.out.print("sum"+sum);
        return sum; 
    }
    public static void main(String[] args){
        String s1;
        int ch,weight=0;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        ch=sc.nextInt();
        if(ch==1)
        {
        weight=vowelinclude(s1); 
        }
        else if(ch==0)
        {
        weight=novowelinclude(s1); 
        }
        System.out.println(weight);
    }
}
