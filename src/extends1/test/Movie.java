package extends1.test;

public class Movie extends Item {

    private String director;
    private String actor;

    Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    void print() {
        super.print();
        System.out.println("director : " + director);
        System.out.println("actor : " + actor);
    }
}
