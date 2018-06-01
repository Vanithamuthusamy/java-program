
import java.util.*;
import java.lang.*;
import java.io.*;class average
{
	public static void main(String args[])
	{
            int sum=0,avg;
	ArrayList<Integer>num=new ArrayList<Integer>();
	num.add(100);
	num.add(99);
	num.add(98);
	num.add(97);
	for(int i=0;i<num.size();i++){
	sum=sum+num.get(i);
	}
	avg=sum/num.size();
	System.out.println(avg);

}
}
