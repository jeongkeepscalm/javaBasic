package extends1.test;

public class Album extends Item {

    private String artist;

    Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    void print() {
        super.print();
        System.out.println("artist : " + artist);
    }
}
