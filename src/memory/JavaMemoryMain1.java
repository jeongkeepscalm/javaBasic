package memory;


// stack 구조
public class JavaMemoryMain1 {
    public static void main(String[] args) {

        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1) {

        System.out.println("method1 start");
        method2(m1*2);
        System.out.println("method1 end");
    }

    static void method2(int m2) {

        System.out.println("method2 start");
        System.out.println("method2 end");

    }
}
