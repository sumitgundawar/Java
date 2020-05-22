import java.util.*;
import java.io.*;
class splendid extends Exception
{
    splendid()
    {
        System.out.println("Splendid");
    }
}
class lazy extends Exception
{
    lazy()
    {
        System.out.println("lazy");
    }
}
class achieve extends Exception
{
    achieve()
    {
        System.out.println("Todays Goal is achieved");
    }
}
class stepCounter1 implements Runnable
{
    int c;
    stepCounter1(int c)
    {
        this.c=c;
    }
    public void run()
    {
        try{
            if(c>10000)
            throw new splendid();
            else if(c<10000)
            throw new lazy();
            else
            throw new achieve();
            } catch(Exception e){}
     }
    public static void main(String args[]) throws Exception
    {
        stepCounter1 s1=new stepCounter1(10000);
        Thread t=new Thread(s1);
        t.start();
        t.join();
        stepCounter1 s2=new stepCounter1(999);
        t=new Thread(s2);
        t.start();
        t.join();
        stepCounter1 s3=new stepCounter1(11000);
        t=new Thread(s3);
        t.start();
        t.join();
    }
}