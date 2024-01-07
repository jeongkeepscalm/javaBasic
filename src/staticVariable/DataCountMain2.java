package staticVariable;

public class DataCountMain2 {
    public static void main(String[] args) {

        new Data2("aaa");
        new Data2("bbb");
        new Data2("ccc");

        System.out.println("생성된 객체의 수 : " + Data2.count);
    }
}
