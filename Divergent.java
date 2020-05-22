import java.util.*;
class Divergent extends Thread
{
    static int x;
    public void run()
    {
        float sum=0;
        int n=1;
        while(sum<=x)
        {
            sum=sum+1/n;
            System.out.println(sum);
            n+=1;
        }
        System.out.println(n);
    }
    public static void main(String args[])
    {
        Divergent d=new Divergent();
        x=2;
        d.start();
    }
}