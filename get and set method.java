import java.util.*;
import java.lang.*;
import java.io.*;
class person{
    private String name;
    private int age;
    private String gender;
    public void setName(String s) {
        name = s;
    }
    public String getName() {
        return name;
    }
    public void setAge(int a)
    {
    	age=a;
    }
    public int getAge()
    {
    	return age;
    }}
class persondetail
{
	public static void main (String[] args) throws java.lang.Exception
	{
	person st=new person();
	Scanner sc =new Scanner(System.in);
	String name=sc.nextLine();
	int age=sc.nextInt();
    st.setName(name);
	st.setAge(age);
	System.out.println("Name: " + st.getName());
	System.out.println("age: " + st.getAge());
}}
