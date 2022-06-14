package l4.kelasi;

public class Main
{

    public static void main(String[] args)
    {
        Class c = new Class();
        c.setName("Negar");
        c.setFamily("Pahlevanzadeh");
        c.setAge(20);
        c.setJob("None");
        c.setUsername("Negapa");
        c.setPassword("password");
        System.out.println("name= "+ c.getName());
        System.out.println("family name= "+ c.getFamily());
        System.out.println("age= "+ c.getAge());
        System.out.println("job= "+ c.getJob());
        System.out.println("username= "+ c.getUsername());
        System.out.println("password= "+ c.getPassword());
    }
}

