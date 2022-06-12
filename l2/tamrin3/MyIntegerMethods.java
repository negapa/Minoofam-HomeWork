package l2.tamrin3;
import java.util.Scanner;

public class MyIntegerMethods implements MyInteger {
    Scanner s=new Scanner(System.in);
    int a;
    public void Input()
    {
        System.out.println("enter a: ");
        a=s.nextInt();
    }
    public void IsOdd()
    {
        if (a%2==0 && a!=0)
        { System.out.println("a is odd");}
    }
    public void IsEven()
    {
        if (a%2!=0 && a!=0)
        { System.out.println("a is even");}
    }
    public void IsPositive()
    {
        if (a>0){
        System.out.println("a is Positive");}
    }
    public void IsNegative()
    {
        if (a<0)
        {System.out.println("a is negative");}
    }
    public void IsZero()
    {
        if (a==0)
        {System.out.println("a is zero");}
    }


    }

