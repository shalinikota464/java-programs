
class Book {

    String title;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        price = 0.0;
    }

    // Constructor with one parameter
    Book(String title) {
        this.title = title;
        price = 0.0;
    }

    // Constructor with two parameters
    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Display method
    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Price: " + price);
        System.out.println();
    }
}

public class BookDemo {

    public static void main(String[] args) {

        Book b1 = new Book();

        Book b2 = new Book("Java Programming");

        Book b3 = new Book("Python Programming", 550.0);

        b1.display();
        b2.display();
        b3.display();
    }
}
