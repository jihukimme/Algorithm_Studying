package Baekjoon.Level3;

import java.io.*;

public class Plus {
    public void plus() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int x, y;

        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");
            x = Integer.parseInt(input[0]);
            y = Integer.parseInt(input[1]);

            sb.append(x + y).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
