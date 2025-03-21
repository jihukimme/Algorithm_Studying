package Baekjoon.StepByStep.Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

//        if(s.equals(new StringBuilder().append(s).reverse().toString())) {
//            System.out.println(1);
//        }
//        else{
//            System.out.println(0);
//        }

        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                System.out.println(0);
                break;
            }
        }

        System.out.println(1);
    }
}
