package Baekjoon.StepByStep.Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n==1){
            System.out.println(1);
            return;
        }

        int range = 6;
        int distance = 2;
        int first = 2;
        int last;

        while(true){
            last = first+range-1;

            if(first<=n && n<=last){
                System.out.println(distance);
                return;
            }

            range += 6;

            first = last+1;
            distance++;
        }



    }
}
