package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int test_case=1; test_case<=T; test_case++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            String[] strArr = br.readLine().split(" ");
            int[] arr = new int[strArr.length];
            for(int i=0; i< strArr.length; i++) {
                arr[i] = Integer.parseInt(strArr[i]);
            }

            int max = getMaxValue(N, P, B, arr);

            sb.append("#").append(test_case).append(" ").append(max).append("\n");
        }

        System.out.println(sb);
    }

    static int getMaxValue(int N, int P, int B, int[] arr){
        int x = 0; // 광고수

        int value = 0;

//        int[] valueArr = new int[N*2];
        int[] valueArr = new int[N];

        for(int i=0; i<arr.length; i++) {
            x = arr[i];

            for(int j=0; j<arr.length; j++){
                if(x <= arr[j]){
                    value+=B*x;
                }
                else {
                    value+=P;
                }
            }

            valueArr[i] = value;
            value = 0;
        }

        Arrays.sort(valueArr);

//        return valueArr[N*2-1];
        return valueArr[N-1];

    }
}