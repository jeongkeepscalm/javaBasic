package oop;


// 절차지향.
public class MusicPlayerMain {

    public static void main(String[] args) {

        MusicPlayer mp = new MusicPlayer();
        mp.turnOn();
        mp.volumeUp();
        mp.volumeUp();
        mp.volumeUp();
        mp.volumeUp();
        mp.volumeDown();
        mp.volumeDown();
        mp.showStatus();
        mp.turnOff();

    }
}
