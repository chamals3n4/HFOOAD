package Maria;

import java.util.List;
import java.util.Iterator;

public class BarkRecognizer {
    private DogDoor door;
    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark){
        System.out.println(" BarkRecognizer: Heard a `" +
                bark.getSound() + "`");
        List allowedBarks = door.getAllowedBarks();
        for(Iterator i = allowedBarks.iterator(); i.hasNext();){
            Bark allowedBark = (Bark) i.next();
            if(allowedBark.equals(bark)){
                door.open();
                return;
            }
        }
        System.out.println("this dog is not allowed");
    }
}
