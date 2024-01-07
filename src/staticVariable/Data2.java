package staticVariable;

public class Data2 {

    public String name;
    public static int count; // 객체가 몇 개 생성되었는지 파악하는 용도.

    public Data2(String name) {
        this.name = name;
        count++;
    }
}
