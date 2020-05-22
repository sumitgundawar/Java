import java.util.*;
class PedictRain
{
	static int days;
	static float rainyDay(int rain[])
	{
		int sum=0,a=0;
		float b;
		for(int i=0;i<days;i++)
		{
			if(rain[i]!=a)
			sum=sum+1;
		}
		return (sum/days);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("No of days:");
		days=sc.nextInt();
		int rainyDetails[]=new int[days];
		for(int i=0;i<days;i++)
			rainyDetails[i]=sc.nextInt();
		System.out.println(rainyDay(rainyDetails));
	}
}