package homework.author2;

public class Book {
    private String title;
    private String description;
    private double price;
    private int caunt;

    public Book(String title, String description, double price, int caunt) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.caunt = caunt;
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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", caunt=" + caunt +
                '}';
    }
}
