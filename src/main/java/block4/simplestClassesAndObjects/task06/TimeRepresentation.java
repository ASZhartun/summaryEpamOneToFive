package block4.simplestClassesAndObjects.task06;

public class TimeRepresentation {
    private int hour;
    private int minutes;
    private int seconds;

    public TimeRepresentation(int hour, int minutes, int seconds) {
        setHour(hour);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public TimeRepresentation() {
        this(0, 0, 0);
    }

    @Override
    public String toString() {
        return "Time: " + this.hour + ":" + this.minutes + ":" + this.seconds;
    }

    public void setHour(int hour) {
        if (hour > 23 || hour < 0) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes > 59 || minutes < 0) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }

    }

    public void setSeconds(int seconds) {
        if (seconds > 59 || seconds < 0) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    public void applyHours(int hours) {
        hours += this.hour;
        setHour(hours % 24);
    }

    public void applyMinutes(int minutes) {
        minutes += this.minutes;
        setMinutes(minutes % 60);
    }

    public void applySeconds(int seconds) {
        seconds += this.seconds;
        setSeconds(seconds % 60);
    }
}
