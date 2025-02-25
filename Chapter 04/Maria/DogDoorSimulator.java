package Maria;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        door.addAllowedBark(new Bark("rowlf"));
        door.addAllowedBark(new Bark("rooowlf"));
        door.addAllowedBark(new Bark("rawlf"));
        door.addAllowedBark(new Bark("woof"));
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        System.out.println("Bruce starts barking");
        recognizer.recognize(new Bark("rowlf"));

        System.out.println("\nFido has gone outside...");
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) { }
        System.out.println("\nFido's all done...");
        System.out.println("...but he's stuck outside!");

        Bark fokingDogBark = new Bark("HUTHTHOO");
        System.out.println("\nanother foking dog barking...");
        recognizer.recognize(fokingDogBark);

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) { }


        System.out.println("\nBruce starts barking...");
        recognizer.recognize(new Bark("rooowlf"));

        System.out.println("\nFido's back inside...");
    }
}