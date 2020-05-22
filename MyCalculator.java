import java.util.*;
class NegativeInputException extends Exception
{
    NegativeInputException()
    {
        System.out.println("n and p should be non-negative");
    }
}
class ZeroInputException extends Exception
{
    ZeroInputException()
    {
        System.out.println("n and p should not be zero");
    }
}
class MyCalculator
{
    long power(long n,long p)
    {
        return (long)Math.pow(n,p);
    }
    public static void main(String args[])
    {
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        long n=sc.nextInt();
        System.out.println("Enter p:");
        long p=sc.nextInt();
        if(n<0 || p<0)
        throw new NegativeInputException();
        else if(n==0 || p==0)
        throw new ZeroInputException();
        else
        {
            MyCalculator mc=new MyCalculator();
            System.out.println(mc.power(n,p));
        }
    }catch(NegativeInputException nie){}
    catch(ZeroInputException zie){}
}
}