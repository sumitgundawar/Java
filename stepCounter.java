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
class stepCounter extends Thread
{
    int c;
    stepCounter(int c)
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
        stepCounter s1=new stepCounter(10000);
        s1.start();
        s1.join();
        stepCounter s2=new stepCounter(999);
        s2.start();
        s2.join();
        stepCounter s3=new stepCounter(11000);
        s3.start();
        s3.join();
    }

}