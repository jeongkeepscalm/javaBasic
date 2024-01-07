package extends1.test;

import extends1.test.Item;

public class Book extends Item {

    private String author;
    private String isbn;

    Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    void print() {
        super.print();
        System.out.println("author : " + author);
        System.out.println("isbn : " + isbn);
    }

}
