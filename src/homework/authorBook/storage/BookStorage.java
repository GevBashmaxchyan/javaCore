package homework.authorBook.storage;

import homework.authorBook.util.ArrayUtil;
import homework.authorBook.model.Author;
import homework.authorBook.model.Book;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            for (Author author1 : books[i].getAuthors()) {
                if (author1.equals(author)) {
                    System.out.println(books[i]);
                }
            }

        }
    }

    public void cauntByAuthor(Author author) {
        int caunt = 0;
        for (int i = 0; i < size; i++) {
            for (Author author1 : books[i].getAuthors()) {
                if (author1.equals(author)) {
                    caunt++;
                }
            }
            System.out.println("caunt of " + author.getEmail() + " authors book is " + caunt);
        }
    }

    public Book getBySerialId(String serialId) {
        for (int i = 0; i < size; i++) {
            if (books[i].getSerialId().equals(serialId)) {
                return books[i];
            }
        }
        return null;
    }

    public void delete(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                ArrayUtil.deleteByIndex(books, i, size);
                size--;
                break;
            }
        }
    }

    public void deleteByAauthor(Author author) {
        for (int i = 0; i < size; i++) {
            for (Author author1 : books[i].getAuthors()) {
                if (author1.equals(author)) {
                    ArrayUtil.deleteByIndex(books, i, size);
                    size--;
                }
            }
        }
    }
}

