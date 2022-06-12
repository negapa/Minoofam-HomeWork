package l3.tamrin3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try{
            StringNoNum();
        }
        catch(Exception e){
            System.out.println("Incorrect String Entry");
        }
    }
    public static void StringNoNum() throws Exception{
        int a=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String");
        String name=s.nextLine();
        boolean alphabet;
        alphabet=name.matches("^[a-zA-Z]*$");
        if(alphabet)
        {
            System.out.println("String length is "+name.length());
        }
        else
        {
            throw new Exception("Incorrect String Entry");
        }
    }
}//System.out.println (str.length ());
