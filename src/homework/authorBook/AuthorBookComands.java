package homework.authorBook;

public interface AuthorBookComands {

     String EXIT = "0";
     String ADD_AUTHOR = "1";
     String ADD_BOOK = "2";
     String SEARCH_AUTHORS = "3";
     String SEARCH_AUTHORS_BY_AGE = "4";
     String SEARCH_BOOKS_BY_TITLE = "5";
     String PRINT_AUTHORS = "6";
     String PRINT_BOOKS = "7";
     String SEARCH_BOOKS_BY_AUTHOR = "8";
     String COUNT_BOOKS_BY_AUTHOR = "9";
     String CHANGE_AUTHOR = "10";
     String CHANGE_BOOK_AUTHOR = "11";
     String DELETE_AUTHOR = "12";
     String DELETE_BOOK = "13";
     String DELETE_BOOK_BY_AUTHOR = "14";
     String ADD_TAGS_TO_BOOK = "15";
     String REMOVE_TAGS_FROM_BOOK = "16";


     static void printCommands() {
        System.out.println("\u001B[34m" + "please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + SEARCH_AUTHORS + " for search author by name");
        System.out.println("please input " + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("please input " + SEARCH_BOOKS_BY_TITLE + " for search book by title");
        System.out.println("please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("please input " + PRINT_BOOKS + " for print books");
        System.out.println("please input " + SEARCH_BOOKS_BY_AUTHOR + " for search books by author");
        System.out.println("please input " + COUNT_BOOKS_BY_AUTHOR + " for print caunt books by author");
        System.out.println("please input " + CHANGE_AUTHOR + " for chenge author");
        System.out.println("please input " + CHANGE_BOOK_AUTHOR + " for chenge book author");
        System.out.println("please input " + DELETE_AUTHOR + " for DELETE_AUTHOR");
        System.out.println("please input " + DELETE_BOOK + " for DELETE_BOOK");
        System.out.println("please input " + DELETE_BOOK_BY_AUTHOR + " for DELETE_BOOK_BY_AUTHOR");
        System.out.println("please input " + ADD_TAGS_TO_BOOK + " for add tag to book");
        System.out.println("please input " + REMOVE_TAGS_FROM_BOOK + " for REMOVE_TAGS_FROM_BOOK" + "\u001B[0m");
    }


}
