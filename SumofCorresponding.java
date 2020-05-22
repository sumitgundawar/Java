import java.util.*;
class SumofCorresponding
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int res=0,n1,n2;
		System.out.println("Enter first number:");
		int x=sc.nextInt();
		System.out.println("Enter second number:");
		int y=sc.nextInt();
		while(x>0 && y>0)
		{
			n1=x%10;
			n2=y%10;
			res=res+(n1*n2);
			x/=10;
			y/=10;
		}
		System.out.println("Sum of corresponding number is "+res);
	}
}