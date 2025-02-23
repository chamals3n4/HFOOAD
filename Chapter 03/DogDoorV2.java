import java.util.Timer;
import java.util.TimerTask;

public class DogDoorV2 {
    private boolean open;

    public DogDoorV2(){
        this.open=false;
    }

    public void open(){
        System.out.println("The dog door is open");
        open=true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close(){
        System.out.println("The dog door is close");
        open=false;
    }

    public boolean isOpen(){
        return open;
    }
}
