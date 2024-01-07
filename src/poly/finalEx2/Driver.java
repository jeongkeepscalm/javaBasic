package poly.finalEx2;

public class Driver {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void drive() {
        car.startEngin();
        car.pressAccelerator();
        car.offEngin();
    }
}
