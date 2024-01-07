package poly.basic;

public class polyMain2 {

    public static void main(String[] args) {

        Parent parent1 = new Parent();
        call(parent1);

        Parent parent2 = new Child();
        call(parent2);

    }

    private static void call(Parent parent) {

//        JAVA16 이상인 경우
//        if (parent instanceof Child child) {
//            System.out.println("this is child instance");
//            child.childMethod();
//        }

        if (parent instanceof Child) {
            System.out.println("this is child instance");
            ((Child) parent).childMethod();
        } else {
            System.out.println("this is not child instance");
        }
    }
}
