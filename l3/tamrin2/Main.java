package l3.tamrin2;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
       try{ CustomEquationRoots();}
       catch(Exception e){
           System.out.println("Equation without answer");
       }

}public static void CustomEquationRoots() throws Exception{
        double a, b, c;
        double delta,rd, x1, x2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a: " );
        a=s.nextInt();
        System.out.println("Enter b: " );
        b=s.nextInt();
        System.out.println("Enter c: " );
        c=s.nextInt();
        delta=((b*b)-(4*a*c));
        if (delta<0){
            throw new Exception("Equation without answer");
        }
        else {
            rd=Math.sqrt(delta);
            x1=(-b+rd)/(2*a);
            x2=(-b-rd)/(2*a);
            if (x1==x2){
                System.out.println("Equation Root is "+ x1);}
            else {System.out.println("Equation Root is "+ x1+ " , "+x2);
        }
    }}}
