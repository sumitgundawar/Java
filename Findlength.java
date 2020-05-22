import java.util.*;
class Findlength
{
	public static void main(String args[])
	{
		String str[]={"vellore","I","from","am"};
		String temp;
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].length()>str[j].length())
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for(int i=0;i<str.length;i++)
		System.out.print(str[i]+" ");
	}
}