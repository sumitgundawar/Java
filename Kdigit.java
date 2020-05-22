import java.util.*;
class Kdigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println("Enter position:");
		int pos=sc.nextInt();
		int rem=0;
		for(int i=0;i<pos;i++)
		{
			rem=num%10;
			num/=10;
		}
		System.out.println("Last "+pos+"th element is "+rem);
	}
}