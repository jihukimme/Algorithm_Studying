package Baekjoon.StepByStep.Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int row = 2;

        int increase = 1;

        for(int i=0; i<n; i++){
            row += increase;
            increase = increase*2;
        }

        int answer = row*row;

        System.out.println(answer);
    }
}
