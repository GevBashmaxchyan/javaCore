package homework.author2;

import java.util.Scanner;

public class AuthorTest {
    static AuthorStorage authorStoreg = new AuthorStorage();
    static Scanner scanner = new Scanner(System.in);

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String SEARCH_AUTHOR = "2";
    private static final String SEARCH_AUTHOR_BY_AGE = "3";
    private static final String PRINT_AUTHOR = "4";


    public static void main(String[] args) {
        authorStoreg.add(new Author("poxos","poxosyan","poxs@mail.ru",22,"male"));
        authorStoreg.add(new Author("poxosuhi","poxosyan","poxsuhi@mail.ru",23,"famale"));
        authorStoreg.add( new Author("vlo","vloyan","vlo@mail.ru",25,"male"));
        boolean isRun = true;
        while (isRun) {
            printComands();
            String comand = scanner.nextLine();
            switch (comand) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case SEARCH_AUTHOR:
                    searachByName();
                    break;
                case SEARCH_AUTHOR_BY_AGE:
                    searchByAge();
                    break;
                case PRINT_AUTHOR:
                    authorStoreg.print();
                    break;
                default:
                    System.out.println("invalid command!");
            }

        }
    }

    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("plase input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStoreg.searchByAge(minAge,maxAge);
    }

    private static void printComands() {
        System.out.println("please input " + EXIT + "  for EXIT");
        System.out.println("please input " + ADD_AUTHOR + "  for add authors");
        System.out.println("please input " + SEARCH_AUTHOR + " for search authors by name");
        System.out.println("please input " + SEARCH_AUTHOR_BY_AGE + " for search authors by age");
        System.out.println("please input " + PRINT_AUTHOR + " for print authors ");
    }

    private static void searachByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStoreg.searchByname(keyword);
    }

    private static void addAuthor() {
        System.out.println("pliz input author's name");
        String name = scanner.nextLine();
        System.out.println("pliz input author's surname");
        String surname = scanner.nextLine();
        System.out.println("pliz input author's email");
        String email = scanner.nextLine();
        System.out.println("pliz input author's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("pliz input author's gender");
        String gender = scanner.nextLine();

        Author author = new Author(name, surname, email, age, gender);
        authorStoreg.add(author);
        System.out.println("Thank you, author was added");
    }
}
