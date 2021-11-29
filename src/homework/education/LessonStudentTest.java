package homework.education;

import java.util.Scanner;

public class LessonStudentTest {
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();
    static Scanner scanner = new Scanner(System.in);

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    private static void printComands() {
        System.out.println("\u001B[34m" + "please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " for add lesson");
        System.out.println("please input " + ADD_STUDENT + " for add student");
        System.out.println("please input " + PRINT_STUDENTS + " for print student");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print student by lesson");
        System.out.println("please input " + PRINT_LESSONS + " for print  lessons");
        System.out.println("please input " + DELETE_LESSON_BY_NAME + " for DELETE  lesson by name");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for DELETE  lesson by email" + "\u001B[0m");
    }

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printComands();
            String comand = scanner.nextLine();
            switch (comand) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("Invalid Comand!");
            }
        }
    }

    private static void deleteStudentByEmail() {
        System.out.println("please input email ");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (email != null) {
            studentStorage.deleteStudent(email);
        } else {
            System.out.println("invalid email");
        }
    }

    private static void deleteLessonByName() {
        System.out.println("pelase input Lesson name ");
        String lessonname = scanner.nextLine();
        Lesson lesson = lessonStorage.getByLessonName(lessonname);
        if (lesson != null) {
            lessonStorage.deleteLesson(lessonname);
        } else {
            System.out.println("invalid lesson name");
        }
    }

    private static void printStudentsByLesson() {
        System.out.println("pelase input Lesson name ");
        String lessonname = scanner.nextLine();
        Lesson lesson = lessonStorage.getByLessonName(lessonname);
        if (lesson != null) {
            studentStorage.print();
        } else {
            System.out.println("Lesson does not exists");
        }
    }

    private static void addStudent() {
        System.out.println("please input lesson name");
        String lessonname = scanner.nextLine();
        Lesson lesson = lessonStorage.getByLessonName(lessonname);
        if (lesson != null) {
            System.out.println("please input Students email");
            String email = scanner.nextLine();
            Student student = studentStorage.getByEmail(email);
            if (student == null) {
                System.out.println("please input Students name");
                String name = scanner.nextLine();
                System.out.println("please input Students surname");
                String surname = scanner.nextLine();
                System.out.println("please input Students age ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("please input Students phone");
                String phone = scanner.nextLine();

                studentStorage.add(new Student(name, surname, age, email, phone, lesson));
                System.out.println("thenk you was student added");
            } else {
                System.out.println("invalid email , please input new email");

            }

        } else {
            System.out.println("invalid lesson name ! please try again");
        }


    }

    private static void addLesson() {

        System.out.println("please input Lesson name");
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByLessonName(name);
        if (lesson == null) {
            System.out.println("please input duration");
            String duration = scanner.nextLine();
            System.out.println("please input lecturerName");
            String lecturerName = scanner.nextLine();
            System.out.println("please input price ");
            int price = Integer.parseInt(scanner.nextLine());

            lessonStorage.add(new Lesson(name, duration, lecturerName, price));
            System.out.println("Thank you, Lesson was added");
        } else {
            System.out.println("please input new lesson");
        }


    }
}



