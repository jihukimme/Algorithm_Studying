package Baekjoon.Level3;

public class MultiplicationTable {
    public void multiplicationTable(int num) {
        for (int i = 0; i < 9; i++) {
            System.out.println(num + " * " + (i + 1) + " = " + num * (i + 1));
        }
    }
}
