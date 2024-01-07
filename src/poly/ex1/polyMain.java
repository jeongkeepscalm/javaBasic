package poly.ex1;

public class polyMain {
    public static void main(String[] args) {
        Parent poly = new Child();
        System.out.println(poly.value); // parent : 변수는 오버라이딩 x
        poly.method(); // child method : 메소드는 오버라이딩 o. 오버라이딩 된 메소드는 항상 우선권을 가진다.
    }


}
