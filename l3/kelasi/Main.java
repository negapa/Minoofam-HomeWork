package l3.kelasi;

public class Main {

        public static void main(String[] args)
        {
            PersonalInfo p=new PersonalInfo();
            try
            {
                p.PersonalInfo();
            }
            catch (Exception e)
            {
                System.out.println("Error user with same info exists!");
            }
        }

}
