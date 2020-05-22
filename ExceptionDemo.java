import java.io.*;
import java.util.*;

class InvalidNameException extends Exception
{
    InvalidNameException()
    {
        System.out.println("Name should not have numbers or special characters");
    }
}
class ExceptionDemo
{
    public static void main(String args[]) //throws IOException
    {

            Scanner sc=new Scanner(System.in);
            String name=sc.next();
            int a=sc.nextInt();
            try{
            for(int i=0;i<name.length();i++)
            {
                if(name.charAt(i)=='1' || name.charAt(i)=='2' || name.charAt(i)=='3' || name.charAt(i)=='4' || name.charAt(i)=='5' || name.charAt(i)=='6' || name.charAt(i)=='7' || name.charAt(i)=='8' || name.charAt(i)=='9' || name.charAt(i)=='0')
                throw new InvalidNameException();
            }
            System.out.println("Name accepted");
        }
        catch(Exception ine)
        {}
            System.out.println(a);
            //br.close();


    }
}