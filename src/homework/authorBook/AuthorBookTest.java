package homework.authorBook;

import homework.authorBook.model.Author;
import homework.authorBook.model.Book;
import homework.authorBook.storage.AuthorStorage;
import homework.authorBook.storage.BookStorage;
import homework.authorBook.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class AuthorBookTest implements AuthorBookComands {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();


    public static void main(String[] args) throws ParseException {

        initData();

        boolean isRun = true;
        while (isRun) {
            AuthorBookComands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksByTitle();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_AUTHOR:
                    searchBooksByAuthor();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    cauntBooksByAuthor();
                    break;
                case CHANGE_AUTHOR:
                    changeAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    changeBookAuthor();
                    break;
                case DELETE_AUTHOR:
                    deleteAuthor();
                    break;
                case DELETE_BOOK:
                    deleteBook();
                    break;
                case DELETE_BOOK_BY_AUTHOR:
                    deleteBookByAuthor();
                    break;
                case ADD_TAGS_TO_BOOK:
                    addTagsToBook();
                    break;
                case REMOVE_TAGS_FROM_BOOK:
                    removeTagsToBook();
                    break;
                default:
                    System.out.println("Invalid command!");
            }

        }
    }

    private static void removeTagsToBook() {
        System.out.println("please choose book by serial id");
        System.out.println("-------");
        bookStorage.print();
        System.out.println("-------");
        String serialId = scanner.nextLine();
        Book book = bookStorage.getBySerialId(serialId);
        if (book != null) {
            System.out.println("please input tags separate , ");
            String tagsStr = scanner.nextLine();
            String[] tagsToRemove = tagsStr.split(",");
            String[] bookTags = book.getTags();
            if (bookTags == null) {
                System.err.println("Book does not have any tags to remove!!!!!");
            } else {
                for (String tag : tagsToRemove) {
                    boolean isExsist = false;
                    for (String bookTag : bookTags) {
                        if (bookTag.equals(tag)) {
                            isExsist = true;
                            break;
                        }
                    }
                    if (!isExsist) {
                        System.err.println(tag + " is noot exists on book" + book);
                        return;
                    }
                }
                String[] newTags = new String[bookTags.length - tagsToRemove.length];
                    int index = 0;
                    for (String bookTag : bookTags) {
                        boolean isExsist = false;
                        for (String toRemove : tagsToRemove) {
                            if (bookTag.equals(toRemove)) {
                                isExsist = true;
                                break;
                            }
                        }
                        if (!isExsist) {
                            newTags[index++] = bookTag;
                        }
                    }
                    book.setTags(newTags);


            }

        }
    }

    private static void addTagsToBook() {
        System.out.println("please choose book by serial id");
        System.out.println("-------");
        bookStorage.print();
        System.out.println("-------");
        String serialId = scanner.nextLine();
        Book book = bookStorage.getBySerialId(serialId);
        if (book != null) {
            System.out.println("please input tags separate , ");
            String tagsStr = scanner.nextLine();
            String[] tags = tagsStr.split(",");
            String[] bookTags = book.getTags();
            if (bookTags == null) {
                book.setTags(tags);
                System.out.println("tags were added!");
            } else {
                for (String tag : tags) {
                    for (String bookTag : bookTags) {
                        if (tag.equals(bookTag)) {
                            System.err.println(tag + "is dublicate please input new tags.");
                            return;
                        }
                    }
                }
                String[] newTegs = new String[bookTags.length + tags.length];
                System.arraycopy(bookTags, 0, newTegs, 0, bookTags.length);
                System.arraycopy(tags, 0, newTegs, bookTags.length, tags.length);
                book.setTags(newTegs);
                System.out.println("tags were added!");
            }
        }
    }

    private static void initData() throws ParseException {
        Author author = new Author("petros", "petrosyan", "petros@mail.com", 25, "male", DateUtil.stringToDate("12/12/2000"));
        Author author1 = new Author("petrosik", "petrosikyan", "petik@mail.com", 33, "male", DateUtil.stringToDate("02/12/1999"));
        Author author2 = new Author("petros", "petrosyan", "petros@mail.com", 33, "male", DateUtil.stringToDate("01/01/2001"));
        authorStorage.add(author);
        authorStorage.add(author1);
        authorStorage.add(author2);
        Author[] authors = {author1, author2};
        String[] tags = {"new", "popular", "detektiv", "lav girq"};
        bookStorage.add(new Book("AR333", "girq1", "desc", 222, 2, authors, tags));
    }

    private static void deleteBookByAuthor() {
        printAuthorsList("please choose author's email");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.deleteByAauthor(author);
        } else {
            System.err.println("Author does nor exists");
        }
    }

    private static void deleteBook() {
        printAuthorsList("please choose author's serialID");
        System.out.println("-------");
        bookStorage.print();
        System.out.println("-------");
        String serialId = scanner.nextLine();
        Book book = bookStorage.getBySerialId(serialId);
        if (book != null) {
            bookStorage.delete(book);
        } else {
            System.err.println("Book with serial ID does nor exists");
        }
    }

    private static void deleteAuthor() {
        printAuthorsList("please choose author's email");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            authorStorage.delete(author);
        } else {
            System.err.println("Author does nor exists");
        }
    }

    private static void printAuthorsList(String s) {
        System.out.println(s);
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");
    }

    private static void changeBookAuthor() {
        printAuthorsList("please choose book by serial id");
        String serialId = scanner.nextLine();
        Book book = bookStorage.getBySerialId(serialId);
        if (book != null) {
            printAuthorsList("please input email by author");
            String emails = scanner.nextLine();
            String[] emailArray = emails.split(",");
            if (emailArray.length == 0) {
                System.out.println("please choose authors");
                return;
            }
            Author[] authors = new Author[emailArray.length];
            int index = 0;
            for (String email : emailArray) {
                Author author = authorStorage.getByEmail(email);
                if (author != null) {
                    authors[index++] = author;
                } else {
                    System.out.println("please input correct authors email");
                    return;
                }
            }
            book.setAuthors(authors);
        } else {
            System.err.println("Book with serial ID does nor exists");
        }

    }

    private static void changeAuthor() {
        printAuthorsList("please input email by author");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input new name authors");
            String name = scanner.nextLine();
            System.out.println("please input new surname authors");
            String surname = scanner.nextLine();
            System.out.println("please input new age authors");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("please input new gender authors");
            String gender = scanner.nextLine();
            author.setName(name);
            author.setSurname(surname);
            author.setAge(age);
            author.setGender(gender);
        } else {
            System.out.println("Author does not exists");
        }
    }

    private static void cauntBooksByAuthor() {
        printAuthorsList("please choose author's email");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.cauntByAuthor(author);
        } else {
            System.out.println("Author does not exists");
        }
    }

    private static void searchBooksByAuthor() {
        printAuthorsList("please choose author's email");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.searchByAuthor(author);
        } else {
            System.out.println("Author does not exists");
        }
    }

    private static void searchBooksByTitle() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByTitle(keyword);
    }

    private static void addBook() {

        printAuthorsList("please choose author's email");
        String emails = scanner.nextLine();
        String[] emailArray = emails.split(",");
        if (emailArray.length == 0) {
            System.out.println("please choose authors");
            return;
        }
        Author[] authors = new Author[emailArray.length];
        int index = 0;
        for (String email : emailArray) {
            Author author = authorStorage.getByEmail(email);
            if (author != null) {
                authors[index++] = author;
            } else {
                System.out.println("please input correct authors email");
                return;
            }
        }
        System.out.println("please input book's serialId");
        String serialId = scanner.nextLine();
        if (bookStorage.getBySerialId(serialId) == null) {

            System.out.println("please input book's title");
            String title = scanner.nextLine();
            System.out.println("please input book's description");
            String desc = scanner.nextLine();
            System.out.println("please input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's count");
            int count = Integer.parseInt(scanner.nextLine());
            System.out.println("please input boo's tags separate , ");
            String tagsStr = scanner.nextLine();
            String[] tags = tagsStr.split(",");

            Book book = new Book(serialId, title, desc, price, count, authors, tags);

            bookStorage.add(book);

            System.out.println("Thank you, Book was added");
        } else {
            System.err.println("Book with SerialID: " + serialId + " is exists");
        }
    }


    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);
    }

    private static void searchByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static void addAuthor() throws ParseException {
        System.out.println("please input author's name,surname,email,gender,age,dateOfBirth[14/12/2000]");
        String authorDataStr = scanner.nextLine();
        String[] authorData = authorDataStr.split(",");
        if (authorData.length == 6) {

            int age = Integer.parseInt(authorData[4]);
            Date date = DateUtil.stringToDate(authorData[5]);
            Author author = new Author(authorData[0], authorData[1], authorData[2], age, authorData[3], date);

            if (authorStorage.getByEmail(author.getEmail()) != null) {
                System.err.println("Invalid email. Author with this email already exists");
            } else {
                authorStorage.add(author);
                System.out.println("Thank you, author  was added");
            }
        } else {
            System.err.println("Invalid data");
        }
    }
}
