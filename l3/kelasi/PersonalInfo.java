package l3.kelasi;
import java.util.Scanner;
public class PersonalInfo
{
        public String name;
        public String age;
        public String family;
    public static void PersonalInfo() throws Exception
    {
        Scanner s=new Scanner(System.in);
        String[]name =new String[2];
        String[]family =new String[2];
        String[]age=new String[2];
        System.out.println("user1: Enter your name ");
        name[0]=s.nextLine();
        System.out.println("user1: Enter your family name ");
        family[0]=s.nextLine();
        System.out.println("user1: Enter your age ");
        age[0]=s.nextLine();
        System.out.println("user2: Enter your name ");
        name[1]=s.nextLine();
        System.out.println("user2: Enter your family name ");
        family[1]=s.nextLine();
        System.out.println("user2: Enter your age ");
        age[1]=s.nextLine();
        if (name[0].equals(name[1]) || age[0].equals(age[1]) || family[0].equals(family[1]))
        {
            throw new Exception("Error user with same info exists");
        }
        else
        {
            System.out.println("user created");
        }

    }
}

