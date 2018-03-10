class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num,rem,sum=0,temp;
		Scanner b= new Scanner(System.in);
		num=b.nextInt();
	            temp=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(temp==sum){
		System.out.println("yes");
		}
	}
}
