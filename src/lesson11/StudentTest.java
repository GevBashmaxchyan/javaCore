package lesson11;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("poxos", "poxosyan", 19
                , "093858588", "Java");

        System.out.println(student.getName());
        student.setName("poxosik");
        System.out.println(student.getName());


    }
}
