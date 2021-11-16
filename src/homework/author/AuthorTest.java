package homework.author;


import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        AuthorStorage authorStorage = new AuthorStorage();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qani hat hexinak uneq?");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("dzer anuny");
            String name = scanner.next();
            System.out.println("dzer azganuny");
            String surname = scanner.next();
            System.out.println("dzer email hascen");
            String email = scanner.next();
            System.out.println("dzer tariqy");
            int age = scanner.nextInt();
            System.out.println("dzer sery");
            String gender = scanner.next();
            Author author= new Author(name,surname,email,age,gender);
            authorStorage.add(author);
        }
        authorStorage.print();





    }
}
