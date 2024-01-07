package extends1.test;

public class Item {
    private String name;
    private int price;

    Item (String name, int price) {
        this.name = name;
        this.price = price;
    }

    void print(){
        System.out.println("name : " + name);
        System.out.println("price : " + price);
    }

    int getPrice() {
        return this.price;
    }

}
