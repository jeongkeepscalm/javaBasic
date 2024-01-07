package poly.test2;

public class Naver implements Pay{


    @Override
    public boolean pay(int amount) {
        System.out.println("pay from naver");
        System.out.println("amount :  " + amount);
        return true;
    }
}
