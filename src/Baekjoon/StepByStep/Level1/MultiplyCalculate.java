package Baekjoon.StepByStep.Level1;

import java.util.Scanner;

public class MultiplyCalculate {
    public void multiplyCalculate() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a * (b % 10));
        System.out.println(a * ((b % 100) / 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }
}
