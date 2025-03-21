package Baekjoon.StepByStep.Level3;

import java.io.*;

public class Plus4 {
    public void plus4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            String[] input = str.split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            sb.append(a + b).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
