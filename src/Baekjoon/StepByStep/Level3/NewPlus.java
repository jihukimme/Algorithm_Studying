package Baekjoon.StepByStep.Level3;

import java.io.*;

public class NewPlus {
    public void newPlus() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            sb.append("Case #").append(i + 1).append(": ")
                    .append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
