package Baekjoon.StepByStep.Level3;

import java.io.*;

public class Star2 {
    public void star2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                sb.append(" ");
            }
            for (int z = 0; z <= i; z++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
