package Baekjoon.Level3;

import java.io.*;

public class Plus2 {
    public void plus2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < num; i++) {
            sum += (i + 1);
        }

        bw.write(String.valueOf(sum));
        bw.flush();
    }
}
