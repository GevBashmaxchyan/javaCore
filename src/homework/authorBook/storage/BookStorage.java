package homework.authorBook.storage;

import homework.authorBook.exception.BookNotFoundException;
import homework.authorBook.model.Author;
import homework.authorBook.model.Book;
import homework.authorBook.util.FileUtil;

import java.util.LinkedList;
import java.util.List;

public class BookStorage {
    private List<Book> books = new LinkedList<>();


    public void add(Book book) {
        books.add(book);
        serialize();
    }


    public void print() {
        for (Book book : books) {
            System.out.println(book);
        }

//        Iterator<Book> iterator = books.iterator();
//        while (iterator.hasNext()){
//            Book book = iterator.next();
//            System.out.println(book);
//        }
    }

    public void searchByTitle(String keyword) {
        for (Book book : books) {
            if (book.getTitle().contains(keyword)) {
                System.out.println(book);
            }
        }
    }

    public void searchByAuthor(Author author) {
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                System.out.println(book);
            }
        }
    }

    public void cauntByAuthor(Author author) {
        int count = 0;
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                count++;
            }
        }
        System.out.println("caunt of " + author.getEmail() + " authors book is " + count);

    }

    public Book getBySerialId(String serialId) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getSerialId().equals(serialId)) {
                return book;
            }
        }
        throw new BookNotFoundException("Book does not exists, serialid: " + serialId);
    }

    public void delete(Book book) {
        books.remove(book);
        serialize();
    }

    public void deleteByAuthor(Author author) {
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                books.remove(book);
            }
        }
        serialize();
    }

    public void initData() {
        List<Book> bookList = FileUtil.deserializeBooks();
        if (bookList != null) {
            books = bookList;
        }
    }

    public void serialize() {
        FileUtil.serializeBooks(books);
    }
}

