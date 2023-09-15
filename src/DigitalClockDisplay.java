import java.util.Observable;
import java.util.Observer;

// Observer-object
public class DigitalClockDisplay implements Observer {
    private String clockTime;

    // update what the Observer receives
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            clockTime = (String) arg;
            displayTime();
            System.out.println("---- ClockDisplay received an update from the Clock ----");
            System.out.println("---- Updated time: " + clockTime + " ----");
        }
    }

    public void displayTime() {
        System.out.println("The time: " + clockTime);
    }
}