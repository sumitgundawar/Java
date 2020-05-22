import java.util.*;
class SortExp
{
	String name;
	int exp;
	SortExp(String name,int exp)
	{
		this.name=name;
		this.exp=exp;
	}
	static void sort(SortExp se[],int n)
	{
		SortExp temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(se[i].exp>se[j].exp)
				{
					temp=se[i];
					se[i]=se[j];
					se[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Name:"+se[i].name+" Exp:"+se[i].exp);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many :");
		int n=sc.nextInt();
		SortExp se[]=new SortExp[n];
		for(int i=0;i<n;i++)
		{System.out.println("Enter name:");
			String name=sc.next();
			System.out.println("Enter experience:");
			int exp=sc.nextInt();
			se[i]=new SortExp(name,exp);
		}
		sort(se,n);
	}
}