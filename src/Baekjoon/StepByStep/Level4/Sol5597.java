package Baekjoon.StepByStep.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] students = new int[30];

        for(int i=0; i<28; i++) {
            int n = Integer.parseInt(br.readLine());

            students[n-1] = 1;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<students.length; i++){
            if(students[i] != 1){
                sb.append(i+1).append("\n");
            }
        }

        System.out.println(sb);
    }
}
