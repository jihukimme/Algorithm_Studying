package Baekjoon.StepByStep.Level2;

public class Alarm {
    public void alarm(int hour, int minute) {
        if (minute >= 45) {
            minute -= 45;
        } else {
            if (hour == 0) {
                hour = 23;
            } else {
                hour -= 1;
            }
            minute = 60 - (45 - minute);
        }
        System.out.println(hour + " " + minute);
    }
}
