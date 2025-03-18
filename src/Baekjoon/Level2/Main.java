package Baekjoon.Level2;

public class Main {
    public static void main(String[] args) {
        OvenAlarm newAlarm = new OvenAlarm();
        newAlarm.ovenAlarm(14, 30, 20);

        Dice diceGame = new Dice();
        int[] diceRoll = {3, 3, 6};
        diceGame.dice(diceRoll);
    }
}
