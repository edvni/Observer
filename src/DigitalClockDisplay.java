import java.util.Observable;
import java.util.Observer;

// Observer-object
public class DigitalClockDisplay implements Observer {
    private String clockTime;

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            clockTime = (String) arg;
            displayTime();
        }
    }

    public void displayTime() {
        System.out.println("Kello: " + clockTime);
    }
}
