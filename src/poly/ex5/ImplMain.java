package poly.ex5;

public class ImplMain {
    public static void main(String[] args) {
        InterfaceA interfaceA = new Impl();
        interfaceA.methodA();
        interfaceA.methodCommon();

        InterfaceB interfaceB = new Impl();
        interfaceB.methodB();
        interfaceB.methodCommon();
    }
}
