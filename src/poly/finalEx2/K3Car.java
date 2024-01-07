package poly.finalEx2;

public class K3Car implements Car {
    @Override
    public void startEngin() {
        System.out.println("k3 car. start ");
    }

    @Override
    public void offEngin() {
        System.out.println("k3 car. off ");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("k3 car. press accelerator ");
    }
}
