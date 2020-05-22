import java.util.*;
class PrimeFactors1
{
	static void primeFactors(int n)
	{
		while(n%2==0)
		{
			System.out.print(2+" ");
			n/=2;
		}
		for(int i=3;i<n;i+=2)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				n/=i;
			}

		}
		if(n>2)
			System.out.print(n);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no :");
		int n=sc.nextInt();
		primeFactors(n);
	}
}