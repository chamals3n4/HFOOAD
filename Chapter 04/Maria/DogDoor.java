package Maria;

import java.util.Timer;
import java.util.TimerTask;
import java.util.LinkedList;
import java.util.List;

public class DogDoor {
    private boolean open;
    private List allowedBarks;

    public DogDoor(){
        this.open=false;
        this.allowedBarks=new LinkedList();
    }

    public void addAllowedBark(Bark bark){
        allowedBarks.add(bark);
    }

    public List getAllowedBarks(){
        return allowedBarks;
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