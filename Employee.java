import java.io.*;
import java.util.*;
class InputException extends Exception
{
    InputException()
    {
        System.out.println("Input is mismatched");
    }
}
class Employee
{
    int ecode,age,exp;
    String name;
    Employee(int ecode,int age,int exp,String name)
    {
        this.ecode=ecode;
        this.age=age;
        this.exp=exp;
        this.name=name;
    }
    void display()
    {
        System.out.println("Name: "+name+" Age: "+age+"Ecode: "+ecode+"Exp: "+exp);
    }
    static void check(int ecode,String name,int age,int exp)
    {
        try{
            int len=0;
            while(ecode>0)
            {
                len++;
                ecode/=10;
            }
            if(len!=6)
            throw new InputException();
            int nlen=name.length();
            if(nlen>30)
            throw new InputException();
            if(age<18 || age>58)
            throw new InputException();
            if(exp<5)
            throw new InputException();
        }catch(Exception e){}
    }
    public static void main(String args[])
    {
        Employee e[]=new Employee[2];
        try
        {
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<5;i++)
            {
                System.out.println("Enter ecode:");
                int ecode=sc.nextInt();
                System.out.println("Enter name:");
                String name=sc.next();
                System.out.println("Enter age:");
                int age=sc.nextInt();
                System.out.println("Enter exp:");
                int exp=sc.nextInt();
                check(ecode,name,age,exp);
                e[i]=new Employee(ecode,age,exp,name);
            }
        }catch(Exception ex){}
        finally
        {
             for(int i=0;i<2;i++)
             e[i].display();
        }
    }
}