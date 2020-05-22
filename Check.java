import java.util.*;
class Check
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(str.matches("^[0-9][0-9][A-Z][A-Z][A-Z][0-9][0-9][0-9][0-9]$"))
        System.out.println("Matches");
    }
}