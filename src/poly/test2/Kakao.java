package poly.test2;

public class Kakao implements Pay{


    @Override
    public boolean pay(int amount) {
        System.out.println("pay from kakao");
        System.out.println("amount :  " + amount);
        return true;
    }
}
