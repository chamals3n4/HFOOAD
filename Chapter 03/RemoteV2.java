import java.util.Timer;
import java.util.TimerTask;

public class RemoteV2 {

    private DogDoorV2 door;

    public RemoteV2(DogDoorV2 door) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("Pressing the remote control button...");
        if (door.isOpen()) {
            door.close();
        } else {
            door.open();

//            final Timer timer = new Timer();
//            timer.schedule(new TimerTask() {
//                public void run() {
//                    door.close();
//                    timer.cancel();
//                }
//            }, 5000);
        }
    }
}