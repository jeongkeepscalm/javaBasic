package poly.test1;

public class FacebookSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("facebook 발송 : " + message);
    }
}
