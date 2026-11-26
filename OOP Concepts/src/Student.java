import java.sql.Statement;

public class Student {
    int id ;
    static  String college = "jbiet";
}

void main(String[] args) {
    Student s1 =new Student();
    s1.id = 101;
    System.out.println(Student.college);
    System.out.println(s1.id);
    Student s2 =new Student();
    s2.id = 102;
    System.out.println(Student.college);
    System.out.println(s2.id);

}
