import java.util.Scanner;
class sum1
{
	int num,limit;
	public sum1()
	{
		num=0;
		limit=0;
	}
	public void getnum(int n,int l)
	{
		num=n;
		limit=l;
	}
	public int fact(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f*=i;
		}
		return f;
	}
	public void sumofseries()
	{
		float sum=0;
		for(int i=0;i<limit;i++)
		{
		sum+=Math.pow(1,i)*(Math.pow(num,i+1)/fact(i+1));
		}
		System.out.println("Sum of the series:"+sum);
	}
	public static void main(String args[])
	{
		sum1 ob=new sum1();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		System.out.println("Enter the limit:");
		int l=in.nextInt();
		ob.getnum(n,l);
		ob.sumofseries();
	}
}
