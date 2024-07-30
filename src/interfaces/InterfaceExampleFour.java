package interfaces;

interface Jeep {
    void drive();
}

interface MusicPlayer {
    void playMusic();
}

class Thar implements Jeep, MusicPlayer {
    public void drive() {
        System.out.println("Driving a Toyota...");
    }

    public void playMusic() {
        System.out.println("Playing music in the Toyota...");
    }
}

public class InterfaceExampleFour {
    public static void main(String[] args) {
    	Thar myToyota = new Thar();
        myToyota.drive();
        myToyota.playMusic();
    }
}