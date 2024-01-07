package poly.finalEx1;

public class Driver {
    private K3Car k3Car;
    private Model3Car model3Car;

    public void setK3Car(K3Car k3Car){
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {

        if (k3Car != null) {
            k3Car.startEngin();
            k3Car.pressAccelerator();
            k3Car.offEngin();
        } else if (model3Car != null) {
            model3Car.startEngin();
            model3Car.pressAccelerator();
            model3Car.offEngin();
        }
    }
}
