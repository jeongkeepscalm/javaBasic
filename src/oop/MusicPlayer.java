package oop;

public class MusicPlayer {

    boolean onOff;
    int volume;

    void turnOn() {
        onOff = true;
        System.out.println("TV is on");
    }

    void turnOff() {
        onOff = false;
        System.out.println("TV is off");
    }

    void volumeUp() {
        volume++;
        System.out.println("volume : " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("volume : " + volume);
    }

    void showStatus() {
        if (onOff) {
            System.out.println(onOff + " / " + volume );
        } else {
            System.out.println(onOff);
        }
    }


}
