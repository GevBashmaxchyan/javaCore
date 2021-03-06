package homework.education;

import homework.education.exception.UserNotFoundException;
import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.model.User;
import homework.education.storage.LessonStorage;
import homework.education.storage.StudentStorage;
import homework.education.storage.UserStorage;

import java.util.Scanner;


public class LessonStudentTest implements LessonStudentComands, UserComands {
    static StudentStorage studentStorage = new StudentStorage();
    static UserStorage userStorage = new UserStorage();
    static LessonStorage lessonStorage = new LessonStorage();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean next = true;
        while (next) {
            UserComands.printcomands();
            String comando = scanner.nextLine();
            switch (comando) {
                case UserComands.EXIT:
                    next = false;
                    break;
                case REGISTER:
                    register();
                    break;
                case LOGIN:
                    login();
                    break;
            }
        }
    }

    private static void register() {
        System.out.println("please input email");
        String email = scanner.nextLine();
        try {
            User byEmail = userStorage.getByEmail(email);
            System.err.println("there is such a user");

        } catch (UserNotFoundException e) {
            System.out.println("please input name");
            String name = scanner.nextLine();
            System.out.println("please input surname");
            String surname = scanner.nextLine();
            System.out.println("please input password");
            String password = scanner.nextLine();
            System.out.println("please input type");
            String type = scanner.nextLine();
            if (type.equalsIgnoreCase("user") || type.equalsIgnoreCase("admin")) {
                userStorage.add(new User(name, surname, email, password, type));
                System.out.println("user was registered!");

            } else {
                System.out.println("invalid type");
            }
        }


    }

    private static void login() {
        System.out.println("please input email");
        String email = scanner.nextLine();
        try {
            User user = userStorage.getByEmail(email);
            System.out.println("please input your password");
            String password = scanner.nextLine();
            if (user.getPassword().equals(password)) {
                if (user.getType().equalsIgnoreCase("USER")) {
                    printComandsUser();
                } else if (user.getType().equalsIgnoreCase("ADMIN")) {
                    printComandsAdmin();
                }

            } else {
                System.out.println("invcalid password");
            }
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }


    private static void printComandsAdmin() {
        boolean isRun = true;
        while (isRun) {
            LessonStudentComands.printComandsAdmin();
            String comand = scanner.nextLine();
            switch (comand) {
                case LOGOUT:
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
                case SEARCH_STUDENTS:
                    searchStudents();
                    break;
                case SEARCH_LESSON:
                    searchLesson();
                    break;
                case CHANGE_STUDENTS:
                    changeStudents();
                    break;
                default:
                    System.out.println("Invalid Comand!");
            }
        }
    }

    private static void printComandsUser() {
        boolean isRun = true;
        while (isRun) {
            LessonStudentComands.printComandsUser();
            String comand = scanner.nextLine();
            switch (comand) {
                case LOGOUT:
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
                case SEARCH_STUDENTS:
                    searchStudents();
                    break;
                case SEARCH_LESSON:
                    searchLesson();
                    break;
                case CHANGE_STUDENTS:
                    changeStudents();
                    break;
                default:
                    System.out.println("Invalid Comand!");
            }
        }
    }

    private static void changeStudents() {
        System.out.println("please input email students");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            System.out.println("please input new  name");
            String name = scanner.nextLine();
            System.out.println("please input new surname");
            String surname = scanner.nextLine();
            System.out.println("please input new age ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("please input new phone");
            String phone = scanner.nextLine();
            student.setName(name);
            student.setSurname(surname);
            student.setAge(age);
            student.setPhone(phone);
        }
    }

    private static void searchLesson() {
        System.out.println("please input lesson name");
        String name = scanner.nextLine();
        lessonStorage.searchName(name);

    }

    private static void searchStudents() {
        System.out.println("please input students email");
        String email = scanner.nextLine();
        studentStorage.searchStudents(email);

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
        System.out.println(" pelase input Lesson name ");
        String lessonname = scanner.nextLine();
        Lesson lesson = lessonStorage.getByLessonName(lessonname);
        if (lesson != null) {
            studentStorage.printByLesson(lessonname);

        } else {
            System.out.println("Lesson does not exists");
        }
    }

    private static void addStudent() {

        System.out.println("please input lesson name");
        String lessonNameStr = scanner.nextLine();
        String[] lessonNames = lessonNameStr.split(",");
        Lesson[] lessons = new Lesson[lessonNames.length];
        for (int i = 0; i < lessonNames.length; i++) {
            if (lessonStorage.getByLessonName(lessonNames[i]) != null) {
                lessons[i] = lessonStorage.getByLessonName(lessonNames[i]);

            } else {
                System.out.println("not lesson");
            }
        }
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

            studentStorage.add(new Student(name, surname, age, email, phone, lessons));
            System.out.println("thenk you was student added");

        } else {
            System.out.println("invalid email , please input new email");

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



