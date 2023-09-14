import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        DigitalClock clock = new DigitalClock();
        DigitalClockDisplay display = new DigitalClockDisplay();

        // register the observer (the display) to clock
        clock.addObserver(display);

        System.out.println("Starting clock...");

        // simulate update of clock time with stopwatch
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                String currentTime = getCurrentTime();
                clock.setTime(currentTime);
            }
        }, 0, 1000); // update time each second

        // stop the watch at the end
        try {
            Thread.sleep(5000); // keep program running for 5 sec
            timer.cancel(); // stop the timer
            System.out.println("Clock stopped.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static String getCurrentTime() {
        long currentTimeMillis = System.currentTimeMillis();
        return Long.toString(currentTimeMillis);
    }
}
