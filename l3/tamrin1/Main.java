package l3.tamrin1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try{
            StudentLoginInfo();
        }
        catch(Exception e){
            System.out.println("Incorrect Password or Username");
        }
    }
    public static void StudentLoginInfo() throws Exception {
        String name = "Negar Pahlevanzadeh";
        String username = "Negapa";
        String password = "password";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Name :");
        String name1 = s.nextLine();
        System.out.println("Enter your username :");
        String username1 = s.nextLine();
        System.out.println("Enter your password :");
        String password1 = s.nextLine();


        if (!name.equals(name1)|| !username.equals(username1) || !password.equals(password1))
    {
        throw new Exception("Incorrect Password or Username");
    }
        else {
        System.out.println("Logged in");
    }

}}

