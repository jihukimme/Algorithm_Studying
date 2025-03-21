package Baekjoon.StepByStep.Level3;

import java.io.*;

public class DataType {
    public void dataType() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int printLong = num / 4;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < printLong; i++) {
            sb.append("long ");
        }

        sb.append("int");
        bw.write(sb.toString());
        bw.flush();
    }
}
