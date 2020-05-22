import java.util.*;
interface Product
{
    void ProductDetails();
    void show_Bill();
}
class Customer
{
    Scanner sc=new Scanner(System.in);
    String name,addr,phno;
    void getDetails()
    {
        System.out.println("Enter name:");
        name=sc.next();
        System.out.println("Enter address:");
        addr=sc.next();
        System.out.println("Enter phno:");
        phno=sc.next();
    }
    void showDetails()
    {
        System.out.println(name+"\n"+addr+"\n"+phno);
    }
}
class OrderOnline extends Customer implements Product
{
    Scanner sc=new Scanner(System.in);
    double total=0;
    public void ProductDetails()
    {
        System.out.println("Enter number of items:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter product name:");
            String pname=sc.next();
            System.out.println("Enter cost of product:");
            int cost=sc.nextInt();
            total+=cost;
        }
        if(total<=10000)
        total=total+total*0;
        else if(total>10000 && total<=30000)
        total=total+total*0.05;
        else if(total>30000 && total<=50000)
        total=total+total*0.07;
        else if(total>50000)
        total=total+total*0.09;
    }
    public void show_Bill()
    {
        System.out.println("Total bill : "+total);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of customers:");
        int no=sc.nextInt();
        OrderOnline oo[]=new OrderOnline[no];
        for(int i=0;i<no;i++)
        {
            oo[i]=new OrderOnline();
            oo[i].getDetails();
            oo[i].ProductDetails();
            oo[i].showDetails();
            oo[i].show_Bill();
        }
    }
}