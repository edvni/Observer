# Observer
 Observer tehtävä

think of the DigitalClock as the one that "observed" or "monitored" for changes in time, and the DigitalClockDisplay as the one that wanted to be "notified" when the time changes.

The DigitalClock doesn't know who is interested in its time; it just broadcasts the change to all registered observers, and DigitalClockDisplay is one of them that responds to the change.

This separation of concerns allows for a flexible and decoupled design where multiple observers can react to changes in the observable without the observable knowing who they are.
