package poly.basic;

public class polyMain {

    public static void main(String[] args) {

        Parent poly = new Child();
        Child poly1 = (Child) poly;
        poly1.childMethod();
        ((Child) poly).childMethod(); // 일시적 다운캐스팅

        Parent parent = new Parent();
        Child child = (Child) parent; // ClassCastException 런타임 오류 : parent 인스턴스에는 child 자체가 존재하지 않는다.
        child.childMethod();


    }
}
