package finalVariable;

public class FinalLocalMain {
    public static void main(String[] args) {

       /** 상수의 값 초기화는 한 번만 가능하다. **/

        final int data1;
        data1 = 10;
//        data1 = 20; 컴파일 오류

        final int data2 = 10;
//        data2 = 20; 컴파일 오류

        method(10);
    }

    static void method(final int num) {
//        num = 20; 컴파일 오류
    }
}
