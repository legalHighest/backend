package top.hjh.spring.ioc.test2;

public class Book {
    int id;
    String bookName;

    double price;

    public Book() {
        System.out.println(this);
    }

    public Book(int id, String bookName, double price) {
        this.id = id;
        this.bookName = bookName;
        this.price = price;
        System.out.println(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
