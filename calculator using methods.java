/* package whatever; // don't place package name!*/ 

import java.util.*;
import java.lang.*;
import java.io.*;
 class calculation
{
int add(int num1,int num2)
{
	int answer=num1+num2;
	return answer;
}
int subtract(int num1,int num2)
{
	int answer=num1-num2;
	return answer;
}
int multiply(int num1,int num2)
{
	int answer=num1*num2;
	return answer;
}
int divide(int num1,int num2)
{
	int answer=num1%num2;
	return answer;
}
}
 class calculator
{
	public static void main(String args[])
	{
	
	int num1,num2,answer=0;
	char operator;
	calculation c=new calculation();
	Scanner sc = new Scanner(System.in);
            num1=sc.nextInt();
	num2=sc.nextInt();
            operator = sc.next().charAt(0);
          switch (operator) {
            case '+': answer = c.add(num1,num2);
                      break;
            case '-': answer = c.subtract(num1,num2);
                      break;
            case '*': answer = c.multiply(num1,num2);
                      break;
            case '/': answer = c.divide(num1,num2);
                      break;
        }
	System.out.println(answer);	
}
}	


    
	
