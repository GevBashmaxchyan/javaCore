package homework.authorBook;

import java.util.Objects;

public class Book {
    private String serialId;//AG1121243
    private String title;
    private String description;
    private double price;
    private int caunt;
    private Author author;


    public Book(String serialId,String title, String description, double price, int caunt, Author author) {
        this.serialId =serialId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.caunt = caunt;
        this.author = author;

    }


    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCaunt() {
        return caunt;
    }

    public void setCaunt(int caunt) {
        this.caunt = caunt;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && caunt == book.caunt && Objects.equals(serialId, book.serialId) && Objects.equals(title, book.title) && Objects.equals(description, book.description) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialId, title, description, price, caunt, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", serialId='" + serialId + '\'' +
                ", price=" + price +
                ", caunt=" + caunt +
                ", author=" + author +
                '}';
    }
}
