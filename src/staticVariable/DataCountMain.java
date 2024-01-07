package staticVariable;

public class DataCountMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
        new Data("aaa", counter);
        new Data("bbb", counter);
        new Data("ccc", counter);

        System.out.println("생성된 객체의 수 : " + counter.count);
    }
}
