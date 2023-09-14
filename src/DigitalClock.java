import java.util.Observable;

// Observable-object (subject), which we monitor
public class DigitalClock extends Observable {
    private String time;

    public void setTime(String time) {
        this.time = time;
        setChanged(); // mark change of state
        notifyObservers(time); // notify observer objects
    }

    public String getTime() {
        return time;
    }


}
