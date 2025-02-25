package Randy;

import Sam.Bark;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        door.setAllowedBark("Rowlf");
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        System.out.println("Bruce starts barking");
        recognizer.recognize("Rowlf");

        System.out.println("\nBruce has gone outside...");
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) { }
        System.out.println("\nBruce's all done...");
        System.out.println("...but he's stuck outside!");

        System.out.println("\nanother foking dog barking...");
        recognizer.recognize("HUTHTHOO");
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) { }

        System.out.println("\nBruce starts barking...");
        recognizer.recognize("Rowlf");

        System.out.println("\nBruce's back inside...");
    }
}