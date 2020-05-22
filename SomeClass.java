import java.util.*;
import java.io.*;
class ZeroDivide extends Exception
{
    ZeroDivide()
    {
        System.out.println("Canot divide by zero");
    }
}
class SomeClass
{
    SomeClass()
    {
        try{
            int a=2;
            int b=0;
            if(b==0)
            throw new ZeroDivide();
            else
            System.out.println("Constructor created");
        }catch(ZeroDivide e){}
    }
    public static void main(String args[])
    {
        new SomeClass();
    }
}