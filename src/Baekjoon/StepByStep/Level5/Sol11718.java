package Baekjoon.StepByStep.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String s;

        while(true){
            s = br.readLine();

            if(s == null || s.isEmpty()) {
                break;
            }

            sb.append(s).append("\n");
        }

        br.close();
        System.out.println(sb);
    }
}
