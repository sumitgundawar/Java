import java.util.*;
class PNZ
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers:");
		int num=sc.nextInt();
		int arr[]=new int[num];
		int p=0,n=0,z=0;
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>0)
				p++;
			else if(arr[i]<0)
				n++;
			else
				z++;
		}
		System.out.println("Positive:"+p+" Negative:"+n+" Zero:"+z);
	}
}