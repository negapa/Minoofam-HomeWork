package l4.tamrin2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Generic <String> g = new Generic <String>();
    System.out.println("Name : ");
    g.setName(scanner.nextLine());
    System.out.println("Family Name :  ");
    g.setFamilyName(scanner.nextLine());
    System.out.println("Student ID: ");
    g.setStuID(scanner.nextLine());
    Generic clone1 = null;
    Generic clone2 = null;
    Generic clone3 = null;

    try {
        clone1 = (Generic) g.clone();
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }


    try {
        clone2 = (Generic) g.clone();
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }


    try {
        clone3 = (Generic) g.clone();
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }

    clone1.out();
    clone2.out();
    clone3.out();

}
}
