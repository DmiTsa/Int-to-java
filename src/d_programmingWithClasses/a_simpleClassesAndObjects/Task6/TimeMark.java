package d_programmingWithClasses.a_simpleClassesAndObjects.Task6;

public class TimeMark {
    public static final int MAX_HOUR = 24;
    public static final int MAX_MINUTE_SECOND = 60;
    private int hour;
    private int minute;
    private int second;

    public TimeMark(int hour, int minute, int second) {
        this.hour = validHour(hour);
        this.minute = validMinuteSecond(minute);
        this.second = validMinuteSecond(second);
    }

    private int validHour(int hour) {
        if (hour < MAX_HOUR && hour >= 0) {
            return hour;
        } else {
            return 0;
        }
    }

    private int validMinuteSecond(int MinuteSecond) {
        if (MinuteSecond < MAX_MINUTE_SECOND && MinuteSecond >= 0) {
            return MinuteSecond;
        } else {
            return 0;
        }
    }

    public String getTime() {
        return "Отметка времени "
                + hour + " ч. "
                + minute + " мин. "
                + second + " сек.";
    }

    public void setOf(int value, char key) {
        switch (key) {
            case 'h':
                hour = validHour(value);
                break;
            case 'm':
                minute = validMinuteSecond(value);
                break;
            case 's':
                second = validMinuteSecond(value);
                break;
        }
    }

    public void changeSeconds(int value) {
        int secondsRest = value % MAX_MINUTE_SECOND;
        if (value > 0) {
            second = (second + secondsRest) % MAX_MINUTE_SECOND;
        } else {
            second = (second + secondsRest + MAX_MINUTE_SECOND) % MAX_MINUTE_SECOND;
        }
    }

    public void changeMinutes(int value) {
        int minuteRest = value % MAX_MINUTE_SECOND;
        if (value > 0) {
            minute = (minute + minuteRest) % MAX_MINUTE_SECOND;
        } else {
            minute = (minute + minuteRest + MAX_MINUTE_SECOND) % MAX_MINUTE_SECOND;
        }
    }

    public void changeHours(int value) {
        int hoursRest = value % MAX_HOUR;
        if (value > 0) {
            hour = (hour + hoursRest) % MAX_HOUR;
        } else {
            hour = (hour + hoursRest + MAX_HOUR) % MAX_HOUR;
        }
    }
}
