package Baekjoon.StepByStep.Level2;

public class OvenAlarm {
    public void ovenAlarm(int hour, int minute, int time) {
        int newTime = minute + hour * 60 + time;
        hour = (newTime / 60) % 24;
        minute = newTime % 60;

        System.out.println(hour + " " + minute);
    }
}
