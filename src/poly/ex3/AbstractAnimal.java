package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound(); // 자식이 무조건 override 를 해야한다.

    public void move() { // 자식이 override 할 필요없다.
        System.out.println("animal is moving");
    }
}
