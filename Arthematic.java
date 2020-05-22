import ArthematicOperations.*;
import java.util.*;
class Arthematic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values for a,b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Addition add=new Addition(a,b);
        System.out.println(add.getSum());
        Substraction sub=new Substraction(a,b);
        System.out.println(sub.getSubstraction());
        Mul mul=new Mul(a,b);
        System.out.println(mul.getMul());
        Divi divi=new Divi(a,b);
        System.out.println(divi.getDiv());
    }
}