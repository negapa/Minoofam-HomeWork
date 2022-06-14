package l4.tamrin1;
import java.util.Collection;
import java.util.TreeMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
    StudentInfo s = new StudentInfo();
    s.setName("Negar PahlevanZadeh");
    s.setNumber(4001234);
    s.setScore (19);

    Map map = new TreeMap();
    map.put("Name",s.getName());
    map.put("Student ID",s.getNumber());
    map.put("GPA",s.getScore());

    System.out.println("Name, Student ID, GPA: "+ map);}}



