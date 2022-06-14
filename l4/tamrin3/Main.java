package l4.tamrin3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner scanner =new Scanner(System.in);
    Generic<Float> g =new Generic<>();
        System.out.println("Name:");
        g.setName(scanner.nextLine());

        System.out.println("Student ID:");
        g.setStudentid(scanner.nextLine());

        System.out.println("Student's Father:");
        g.setFatherName(scanner.nextLine());

        System.out.println("Grades : ");
        for (int i = 0; i <5 ; i++) {
        g.GradesGetter(scanner.nextFloat());
    }

        System.out.println("Student Information:  ");
        System.out.println("Name: " + g.getName());
        System.out.println("Student ID: " + g.getStudentid());
        System.out.println("Father's name: " + g.getFatherName());
        System.out.println("Grades: ");
        for (Float Grades:g.GradesList)
    {
        System.out.println(Grades);
}}}
