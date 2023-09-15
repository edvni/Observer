import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        DigitalClock clock = new DigitalClock();
        DigitalClockDisplay display = new DigitalClockDisplay();

        // register the observer (the display) to clock
        clock.addObserver(display);

        System.out.println("Starting clock...");

        // set time to 12:30:45
        clock.setTime(12, 30, 45);

        // simulate time progression
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                advanceTime(clock);
            }
        }, 1000, 1000); // update time each second

        try {
            Thread.sleep(5000);
            timer.cancel(); // stop the timer
            System.out.println("Clock stopped.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    // simulate progression of time in DigitalClock class
    private static void advanceTime(DigitalClock clock) {
        int hours = clock.getHours();
        int minutes = clock.getMinutes();
        int seconds = clock.getSeconds() + 1;

        if (seconds == 60) {
            seconds = 0;
            minutes += 1;
            if (minutes == 60) {
                minutes = 0;
                hours += 1;
                if (hours == 24) {
                    hours = 0;
                }
            }
        }
        clock.setTime(hours, minutes, seconds);
    }
}