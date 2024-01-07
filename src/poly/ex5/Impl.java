package poly.ex5;

// 인터페이스 다중 구현
public class Impl implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("child method A");
    }
    @Override
    public void methodB() {
        System.out.println("child method B");
    }
    @Override
    public void methodCommon() {
        System.out.println("child method common");
    }
}
