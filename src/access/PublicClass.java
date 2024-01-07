package access;

// public class : 모든 패키지에서 접근 가능.
public class PublicClass {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1 {
    // default class : 다른 패키지에서 접근 불가.
}

class DefaultClass2 {
    // default class : 다른 패키지에서 접근 불가.
}