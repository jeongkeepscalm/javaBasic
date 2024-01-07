package poly.test1;

public class polyMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new FacebookSender(), new SmsSender()};
        for (Sender sender : senders) {
            sender.sendMessage("welcome");
        }
    }
}
