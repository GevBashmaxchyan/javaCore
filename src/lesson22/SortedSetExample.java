package lesson22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortedSetExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student = new Student("poxos", "poxosyan", 22, "poxos@mail.ru");
        Student student1 = new Student("arto", "poxosyan", 32, "arto@mail.ru");
        Student student2 = new Student("vzgo", "poxosyan", 24, "vzgo@mail.ru");

        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() == o2.getAge()) {
                    return 0;
                } else if (o1.getAge() > o2.getAge()) {
                    return -1;
                }
                return 1;
            }
        });

        for (Student st : studentList) {
            System.out.println(st);
        }
    }
}
