package homework.author2;

import java.util.Scanner;

public class AuthorTest {
    static BookStorage bookStorage = new BookStorage();
    static AuthorStorage authorStorage = new AuthorStorage();
    static Scanner scanner = new Scanner(System.in);

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String SEARCH_AUTHOR = "2";
    private static final String SEARCH_AUTHOR_BY_AGE = "3";
    private static final String PRINT_AUTHOR = "4";
    private static final String ADD_BOOK = "5";
    private static final String PRINT_BOOKS = "6";
    private static final String SERARCH_BOOKS_BY_TITLE = "7";


    public static void main(String[] args) {
        authorStorage.add(new Author("poxos", "poxosyan", "poxs@mail.ru", 22, "male"));
        authorStorage.add(new Author("poxosuhi", "poxosyan", "poxsuhi@mail.ru", 23, "famale"));
        authorStorage.add(new Author("vlo", "vloyan", "vlo@mail.ru", 25, "male"));
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
                    searchByName();
                    break;
                case SEARCH_AUTHOR_BY_AGE:
                    searchByAge();
                    break;
                case PRINT_AUTHOR:
                    authorStorage.print();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SERARCH_BOOKS_BY_TITLE:
                    searchByBookTitle();
                    break;
                default:
                    System.out.println("invalid command!");
            }

        }
    }

    private static void searchByBookTitle() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByBookTitle(keyword);
    }

    private static void addBook() {
        System.out.println("please input title");
        String title = scanner.nextLine();
        System.out.println("please input description");
        String description = scanner.nextLine();
        System.out.println("please input price");
        double price = Integer.parseInt(scanner.nextLine());
        System.out.println("please input caunt");
        int caunt = Integer.parseInt(scanner.nextLine());
        Book book=new Book(title,description,price,caunt);
        bookStorage.add(book);
        bookStorage.print();
    }

    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("plase input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);
    }

    private static void printComands() {
        System.out.println("please input " + EXIT + "  for EXIT");
        System.out.println("please input " + ADD_AUTHOR + "  for add authors");
        System.out.println("please input " + SEARCH_AUTHOR + " for search authors by name");
        System.out.println("please input " + SEARCH_AUTHOR_BY_AGE + " for search authors by age");
        System.out.println("please input " + PRINT_AUTHOR + " for print authors ");
        System.out.println("please input " + ADD_BOOK + " for add books ");
        System.out.println("please input " + PRINT_BOOKS + " for print books ");
        System.out.println("please input " + SERARCH_BOOKS_BY_TITLE + " for search books by title ");
    }

    private static void searchByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByname(keyword);
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
        authorStorage.add(author);
        System.out.println("Thank you, author was added");
    }
}
