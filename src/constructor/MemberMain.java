package constructor;

import java.lang.reflect.Member;

public class MemberMain {

    public static void main(String[] args) {
        MemberInit memberInit = new MemberInit();
        new MemberInit("ojg", 30, 100);
        new MemberInit("lee", 23);
    }
}
