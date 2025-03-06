package lecture_9.equalsAndHashCode;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    // equals
    // 1. x.equals(x) = true
    // 2. если x.equals(y) = true, то и y.equals(x) = true
    // 3. если x.equals(y) = true и y.equals(z) = true, то и x.equals(z) = true
    // 4. x.equals(null) = false


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

        @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(author);
        result = 31 * result + Double.hashCode(price);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
