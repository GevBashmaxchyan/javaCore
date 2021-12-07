package homework.authorBook.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String serialId;//AG1121243
    private String title;
    private String description;
    private double price;
    private int caunt;
    private Author[] authors;
    private String[] tags;

    public Book(String serialId, String title, String description, double price, int caunt, Author[] authors) {
        this.serialId = serialId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.caunt = caunt;
        this.authors = authors;
    }

    public Book(String serialId, String title, String description, double price, int caunt, Author[] authors, String[] tags) {
        this.serialId =serialId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.caunt = caunt;
        this.authors = authors;
        this.tags = tags;

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

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "serialId='" + serialId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", caunt=" + caunt +
                ", authors=" + Arrays.toString(authors) +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (Double.compare(book.price, price) != 0) return false;
        if (caunt != book.caunt) return false;
        if (serialId != null ? !serialId.equals(book.serialId) : book.serialId != null) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        if (description != null ? !description.equals(book.description) : book.description != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(authors, book.authors)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(tags, book.tags);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = serialId != null ? serialId.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + caunt;
        result = 31 * result + Arrays.hashCode(authors);
        result = 31 * result + Arrays.hashCode(tags);
        return result;
    }
}
