package Baekjoon.Level3;

import java.io.*;

public class Receipt {
    public void receipt() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalMoney = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int compareMoney = 0;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int itemMoney = Integer.parseInt(input[0]);
            int itemCount = Integer.parseInt(input[1]);

            compareMoney += (itemMoney * itemCount);
        }

        bw.write(totalMoney == compareMoney ? "Yes" : "No");
        bw.flush();
    }
}
