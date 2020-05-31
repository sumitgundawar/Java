import java.util.*;
public class BinaryNumberGenerator
{
    static void generateBinaryNumber(int n)
    {
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while(n-- > 0)
        {
            String s1 = q.peek();
            q.remove();
            System.out.print(s1+" ");
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a jumber between 5 and 20:");
        int n=sc.nextInt();
        if(n>=5 && n<=20)
        {
            generateBinaryNumber(n);
        }
        else
        System.out.println("Enter between 5 and 20");
    }
}