public class BarkRecognizer {
    private DogDoorV2 door;
    public BarkRecognizer(DogDoorV2 door) {
        this.door = door;
    }

    public void recognize(String bark){
        System.out.println(" BarkRecognizer: Heard a `" +
                bark + "`");
        door.open();
    }
}
