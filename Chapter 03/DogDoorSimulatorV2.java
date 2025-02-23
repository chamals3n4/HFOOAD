public class DogDoorSimulatorV2 {

    public static void main(String[] args) {
        DogDoorV2 door = new DogDoorV2();
        BarkRecognizer recognizer = new BarkRecognizer(door);
        RemoteV2 remote = new RemoteV2(door);

        System.out.println("Fido starts barking");
        recognizer.recognize("Woof");

        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido's all done...");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) { }

        System.out.println("...but he's stuck outside!");

        System.out.println("\nFido starts barking...");
        recognizer.recognize("Woof");

        System.out.println("\nFido's back inside...");
    }
}