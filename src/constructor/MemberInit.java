package constructor;

public class MemberInit {

    String name;
    int age;
    int grade;

    // 기본 생성자
    MemberInit(){};

    // 오버로딩
    MemberInit(String name, int age) {
        this(name, age, 50);

//        this.name = name;
//        this.age = age;
//        this.grade = 50;

    }

    MemberInit(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

