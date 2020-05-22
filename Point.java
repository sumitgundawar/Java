import java.util.*;
interface i1
{
    void showPoints();
     void setPoints(int x,int y);
}
interface i2
{
    void printCoordinates();
    void returnX();
    void returnY();
}
class Point implements i1,i2
{
    static int x,y;
    public void showPoints()
    {
        System.out.println("X="+x+"Y"+y);
    }
    public void setPoints(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void printCoordinates()
    {
        System.out.println("("+x+", "+y+")");
    }
    public void returnX()
    {
        System.out.println(x);
    }
    public void returnY()
    {
            System.out.println(y);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Point p=new Point();
        while(true)
        {
            System.out.println("1.Set Points\n2.Show Points\n3.Print Coordinates\n4.Return X\n5.Return Y\nEnter choice:");
            int ch=sc.nextInt();
            switch(ch)
            {
             case 1: System.out.println("Enter x ");
                        x=sc.nextInt();
                        System.out.println("Enter y ");
                        y=sc.nextInt();
                        p.setPoints(x,y);
                        break;
             case 2:p.showPoints();
             break;
             case 3:p.printCoordinates();
             break;
             case 4:p.returnX();
             break;
             case 5:p.returnY();
             break;
         }
     }
 }
}