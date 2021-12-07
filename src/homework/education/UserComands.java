package homework.education;

public interface UserComands {
    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";


    static void printcomands() {
        System.out.println("\u001B[34m" + "please input  " + EXIT + "  for exit");
        System.out.println("please input  " + LOGIN + "  for login");
        System.out.println("please input  " + REGISTER + "  for register" + "\u001B[0m");
    }

}
