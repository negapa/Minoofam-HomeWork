package l2.tamrin2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a;
        String newLine = System.getProperty("line.separator");
        System.out.println("Moshakhaste kodam Dars morede nazaretan ast?" + newLine + "1:Riazi 2"+ newLine + "2:Fizik2"+ newLine+ "3:Difransiel"+ newLine + "4:Gosaste"+ newLine+ "5:Barname Sazi Pishrafte"+ newLine+ "adade darse morede nazar ra vared konid:");
        a= s.nextInt();
        Info i= new Info();
        switch (a){
            case 1:
                System.out.println("Riazi 2: ");i.Riazi2Fizik2Differential();
                break;
            case 2:
                System.out.println("Fizik 2: ");i.Riazi2Fizik2Differential();
                break;
            case 3:
                System.out.println("Difransiel: ");i.Riazi2Fizik2Differential();
                break;
            case 4:
                System.out.println("Gosaste: ");i.Gosaste();
                break;
            case 5:
                System.out.println("Barname Sazi Pishrafte: ");i.BarnamePishrafte();
                break;
            default:
                System.out.println("Error! Run program again");
                break;
        }
    }
}
