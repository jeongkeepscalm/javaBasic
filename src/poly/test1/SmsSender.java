package poly.test1;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("sms 발송 : " + message);
    }
}
