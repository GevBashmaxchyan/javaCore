package homework.education;

public interface LessonStudentComands {


    String EXIT_COMAND = "0";
    String ADD_LESSON = "1";
    String ADD_STUDENT = "2";
    String PRINT_STUDENTS = "3";
    String PRINT_STUDENTS_BY_LESSON = "4";
    String PRINT_LESSONS = "5";
    String DELETE_LESSON_BY_NAME = "6";
    String DELETE_STUDENT_BY_EMAIL = "7";
    String SEARCH_STUDENTS = "8";
    String SEARCH_LESSON = "9";
    String CHANGE_STUDENTS = "10";

    static void printComands() {
        System.out.println("\u001B[34m" + "please input " + EXIT_COMAND + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " for add lesson");
        System.out.println("please input " + ADD_STUDENT + " for add student");
        System.out.println("please input " + PRINT_STUDENTS + " for print student");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print student by lesson");
        System.out.println("please input " + PRINT_LESSONS + " for print  lessons");
        System.out.println("please input " + DELETE_LESSON_BY_NAME + " for DELETE  lesson by name");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for DELETE  lesson by email");
        System.out.println("please input " + SEARCH_STUDENTS + " for search students ");
        System.out.println("please input " + SEARCH_LESSON + " for search lesson ");
        System.out.println("please input " + CHANGE_STUDENTS + " for change students " + "\u001B[0m");
    }
    static void printComands1() {
        System.out.println("\u001B[34m" + "please input " + EXIT_COMAND + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " for add lesson");
        System.out.println("please input " + ADD_STUDENT + " for add student");
        System.out.println("please input " + PRINT_STUDENTS + " for print student");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print student by lesson");
        System.out.println("please input " + PRINT_LESSONS + " for print  lessons");
        System.out.println("please input " + SEARCH_STUDENTS + " for search students ");
        System.out.println("please input " + SEARCH_LESSON + " for search lesson ");
        System.out.println("please input " + CHANGE_STUDENTS + " for change students " + "\u001B[0m");
    }
}
