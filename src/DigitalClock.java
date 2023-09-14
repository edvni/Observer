import java.util.Observable;

// Observable-object (subject), which we monitor
public class DigitalClock extends Observable {
    private int hours;
    private int minutes;
    private int seconds;

    public void setTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        setChanged(); // mark change of state
        notifyObservers(getCurrentTime()); // notify observer objects
    }

    public String getCurrentTime() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
}