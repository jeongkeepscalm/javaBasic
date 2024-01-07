package extends1.test;

import com.sun.jdi.event.MonitorContendedEnteredEvent;

public class TestMain {
    public static void main(String[] args) {
        Book book = new Book("java", 10000, "hand", "12345");
        Album album = new Album("album1", 15000, "seo");
        Movie movie = new Movie("movie1", 17000, "tom", "ojg");

        book.print();
        System.out.println("--------------");
        album.print();
        System.out.println("--------------");
        movie.print();

        int totalPrice = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("totalPrice : " + totalPrice);

    }
}
