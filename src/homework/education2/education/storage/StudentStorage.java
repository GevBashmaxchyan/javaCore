package homework.education2.education.storage;


import homework.education2.education.model.Student;
import homework.education2.education.util.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class StudentStorage {
    private List<Student> students = new ArrayList<>();


    public void add(Student student) {
        students.add(student);
        serialize();
    }


    public void print() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student getByEmail(String email) {
        for (Student student : students) {
            if (student.getEmail().equals(email)) {
                return student;
            }
        }

        return null;
    }


    public void deleteStudent(String email) {
        for (Student student : students) {
            if (student.getEmail().equals(email)) {
                students.remove(student);
            }
        }
        serialize();

    }

    public void searchStudents(String email) {
        for (Student student : students) {
            if (student.getEmail().equals(email)) {
                System.out.println(student);
            }
        }
    }

    public void printByLesson(String lessonname) {
        for (Student student : students) {
            if (student.getLessons().equals(lessonname)){
                System.out.println(student);
                break;
            }
        }

    }
    public void serialize(){
        FileUtil.serializeStudents(students);
    }


    public void initeData() {
        List<Student> studentList = FileUtil.deserializeStudents();
        if (studentList != null) {
            students = studentList;
        }
    }
}
