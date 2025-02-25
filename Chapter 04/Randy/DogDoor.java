package Randy;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private String allowedBark;

    public DogDoor(){
        this.open=false;
    }

    public void setAllowedBark(String allowedBark){
        this.allowedBark=allowedBark;
    }

    public String getAllowedBark(){
        return allowedBark;
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