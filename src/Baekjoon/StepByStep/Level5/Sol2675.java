package Baekjoon.StepByStep.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for(int j=0; j<s.length(); j++){
                for(int k=0; k<r; k++){
                    sb.append(s.charAt(j));
                }
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
