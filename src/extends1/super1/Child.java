package extends1.super1;

public class Child extends Parents {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child hello");
    }

    public void call() {
        System.out.println("Child.value : " + this.value);
        System.out.println("Parents.value : " + super.value);

        this.hello();
        super.hello();
    }

}
