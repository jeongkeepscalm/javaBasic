package poly.finalEx2;

public class CarMain {
    public static void main(String[] args) {

        Driver driver = new Driver();
        
        driver.setCar(new K3Car());
        driver.drive();
        
        // 차량 변경
        driver.setCar(new Model3Car());
        driver.drive();
    }
}
