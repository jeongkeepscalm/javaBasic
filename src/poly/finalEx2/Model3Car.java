package poly.finalEx2;

public class Model3Car implements Car {
    @Override
    public void startEngin() {
        System.out.println("Model3Car. start ");
    }

    @Override
    public void offEngin() {
        System.out.println("Model3Car. off ");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3Car. press accelerator ");
    }
}
