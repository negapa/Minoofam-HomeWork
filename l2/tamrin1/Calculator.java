package l2.tamrin1;
import java.util.Scanner;
public class Calculator {
    Scanner s= new Scanner(System.in);
    double a;
    double b;
    public void Input(){
        System.out.println("enter a: ");
        a= s.nextInt();
        System.out.println( "enter b: ");
        b= s.nextInt();
    }
    public void Multiplication(){
        System.out.println("a*b= "+ (a*b));
    }
    public void Summation(){
        System.out.println("a+b= "+ (a+b));
    }
    public void Subtraction(){
        System.out.println("a-b= "+ (a-b));
    }
    public void Division(){
        System.out.println("a/b= "+ (a/b));
    }
}






