import java.util.*;
class President extends Thread
{
    static int votes[]=new int[200];
    static int acnt=0,bcnt=0,ccnt=0,start,end;
    President(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
    synchronized public void run()
    {
        for(int i=start;i<end;i++)
        {
            if(votes[i]==1)
            acnt++;
            else if(votes[i]==2)
            bcnt++;
            else
            ccnt++;
        }
    }
    static void display()
    {
        System.out.println(acnt+" "+bcnt+" "+ccnt);
        if(acnt>bcnt && acnt>ccnt)
        System.out.println("A is president");
        else if(bcnt>acnt && bcnt>ccnt)
        System.out.println("B is president");
        else
        System.out.println("C is president");
    }
    public static void main(String args[])
    {
        Random r=new Random();
        for(int i=0;i<200;i++)
        votes[i]=r.ints(1, (3 + 1)).findFirst().getAsInt();
        President p1=new President(0,40);
        p1.start();
        President p2=new President(41,80);
        p2.start();
        President p3=new President(81,120);
        p3.start();
        President p4=new President(121,160);
        p4.start();
        President p5=new President(161,200);
        p5.start();
        display();
    }
}