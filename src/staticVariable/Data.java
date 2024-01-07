package staticVariable;

public class Data {

    public String name;

    public Data(String name, Counter counter) {
        this.name = name;
        counter.count++; // 객체가 몇 개 생성되었는지 파악하는 용도.
    }
}
