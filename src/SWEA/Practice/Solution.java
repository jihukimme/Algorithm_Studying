package SWEA.Practice;// for SWEA


///////////////////////////////////////////////////////////////////////////////////////////////
//2072번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//        int T = Integer.parseInt(br.readLine());
//
//        int sum;
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            st = new StringTokenizer(br.readLine());
//
//            sum = 0;
//
//            for(int i=0; i<10; i++){
//                int n = Integer.parseInt(st.nextToken());
//                if(n % 2 != 0){
//                    sum += n;
//                }
//            }
//
//            sb.append("#" + test_case + " " + sum).append("\n");
//        }
//
//        System.out.println(sb);
//    }
//}
///////////////////////////////////////////////////////////////////////////////////////////////



///////////////////////////////////////////////////////////////////////////////////////////////
//1859번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            int N = Integer.parseInt(br.readLine());
//            int[] arr = new int[N];
//
//            int max = 0;
//            long diff = 0;
//
//            st = new StringTokenizer(br.readLine(), " ");
//
//            for(int i=0; i<N; i++){
//                arr[i] = Integer.parseInt(st.nextToken());
//            }
//
//            // 최대 이익을 구해야 함
//            // 배열에서 최대값을 찾고 최대값에서 가지고 있는 값을 뺀 수들을 더하면 됨
//            // 만약 최대값의 순서보다 큰 수가 있으면 새로운 최대값을 뒤에서 찾아야 함
//
//            for(int j=N-1; j>=0; j--){
//                if(arr[j]>max){
//                    max = arr[j];
//                }
//                diff += max - arr[j];
//            }
//
//            sb.append("#" + test_case + " " + diff + "\n");
//        }
//        System.out.println(sb);
//    }
//
//}
///////////////////////////////////////////////////////////////////////////////////////////////




/////////////////////////////////////////////////////////////////////////////////////////////
////2071번
//import java.util.*;
//import java.io.*;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            double sub = 0;
//            double avg;
//
//            st = new StringTokenizer(br.readLine(), " ");
//
//            for(int i=0; i<10; i++){
//                 sub += Integer.parseInt(st.nextToken());
//            }
//
//            avg = sub/10;
//
//            sb.append("#" + test_case + " " + String.format("%.0f", avg) + "\n");
//        }
//
//        System.out.println(sb);
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////





/////////////////////////////////////////////////////////////////////////////////////////////
////21425번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//class Solution
//{
//    static int cnt;
//
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            st = new StringTokenizer(br.readLine(), " ");
//
//            cnt = 0;
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            int n = Integer.parseInt(st.nextToken());
//
//            if(a>b){
//                dfs(a,b,n);
//            }
//            else {
//                dfs(b,a,n);
//            }
//
//            sb.append(cnt).append("\n");
//        }
//
//        System.out.println(sb);
//    }
//
//    public static void dfs(int x, int y, int n){
//        int sum = x + y;
//        cnt++;
//
//        if(sum > n){
//            return;
//        }
//
//        dfs(sum,x,n);
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////





/////////////////////////////////////////////////////////////////////////////////////////////
////2070번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//        int a,b;
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            st = new StringTokenizer(br.readLine(), " ");
//
//            a = Integer.parseInt(st.nextToken());
//            b = Integer.parseInt(st.nextToken());
//
//            if(a<b){
//                sb.append("#").append(test_case).append(" <").append("\n");
//            }
//            else if(a>b) {
//                sb.append("#").append(test_case).append(" >").append("\n");
//            }
//            else{
//                sb.append("#").append(test_case).append(" =").append("\n");
//            }
//        }
//
//        System.out.println(sb);
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////




/////////////////////////////////////////////////////////////////////////////////////////////
////2068번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.StringTokenizer;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            st = new StringTokenizer(br.readLine(), " ");
//
//            int[] arr = new int[10];
//            for(int i=0; i<10; i++){
//                arr[i] = Integer.parseInt(st.nextToken());
//            }
//
//            Arrays.sort(arr);
//
//            sb.append("#").append(test_case).append(" ").append(arr[9]).append("\n");
//        }
//
//        System.out.println(sb);
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////



/////////////////////////////////////////////////////////////////////////////////////////////
////2063번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        StringBuilder sb = new StringBuilder();
//
//        int[] arr = new int[T];
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            arr[test_case-1] = Integer.parseInt(st.nextToken());
//        }
//
//        //T는 항상 홀수 중간 값은 (T+1)/2
//        Arrays.sort(arr);
//        sb.append(arr[(T+1)/2 - 1]);
//
//        System.out.println(sb);
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////



/////////////////////////////////////////////////////////////////////////////////////////////
////1926번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            String s = String.valueOf(test_case);
//
//            if(s.contains("3") || s.contains("6") || s.contains("9")) {
//                for (int i = 0; i < s.length(); i++) {
//                    if (s.charAt(i) == '3' || s.charAt(i) == '6' || s.charAt(i) == '9') {
//                        sb.append("-");
//                    }
//                }
//                sb.append(" ");
//            }
//            else {
//                sb.append(test_case).append(" ");
//            }
//        }
//
//        System.out.println(sb);
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////




/////////////////////////////////////////////////////////////////////////////////////////////
////2007번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            String s = br.readLine();
//
//            for(int i=1; i<=s.length(); i++){
//                String a = s.substring(0,i);
//                String b = s.substring(i, i+i);
//                if(a.equals(b)) {
//                    sb.append("#").append(test_case).append(" ").append(a.length()).append("\n");
//                    break;
//                }
//            }
//        }
//
//        System.out.println(sb);
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////



/////////////////////////////////////////////////////////////////////////////////////////////
////2005번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            sb.append("#").append(test_case).append("\n");
//
//            int N = Integer.parseInt(br.readLine());
//
//            int[][] arr = new int[N][N];
//            arr[0][0] = 1;
//
//            for(int i=1; i<N; i++){
//                arr[i][0] = 1;
//                arr[i][i] = 1;
//
//                for(int j=1; j<N; j++){
//                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
//                }
//            }
//
//            for(int i=0; i<N; i++){
//                for(int j=0; j<N; j++){
//                    if(arr[i][j] != 0){
//                        sb.append(arr[i][j]).append(" ");
//                    }
//                }
//                sb.append("\n");
//            }
//        }
//
//        System.out.println(sb);
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////




/////////////////////////////////////////////////////////////////////////////////////////////
////2001번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            st = new StringTokenizer(br.readLine(), " ");
//
//            int N = Integer.parseInt(st.nextToken());
//            int M = Integer.parseInt(st.nextToken());
//
//            int[][] arr = new int[N][N];
//
//            for(int i=0; i<N; i++){
//                st = new StringTokenizer(br.readLine(), " ");
//
//                for(int j=0; j<N; j++){
//                    arr[i][j] = Integer.parseInt(st.nextToken());
//                }
//            }
//
//            int max = 0;
//
//            for(int i=0; i<N-M+1; i++){
//                for(int j=0; j<N-M+1; j++){
//                    int sum = 0;
//                    for(int k=0; k<M; k++){
//                        for(int t=0; t<M; t++) {
//                            sum += arr[k + i][t + j];
//                        }
//                    }
//
//                    if(max<sum){
//                        max = sum;
//                    }
//                }
//            }
//
//            sb.append("#").append(test_case).append(" ").append(max).append("\n");
//        }
//
//        System.out.println(sb);
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////



/////////////////////////////////////////////////////////////////////////////////////////////
////789번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            String s = br.readLine();
//
//            String reversS = new StringBuilder(s).reverse().toString();
//
//            int result = (s.equals(reversS)) ? 1 : 0;
//
//            sb.append("#").append(test_case).append(" ").append(result).append("\n");
//        }
//
//        System.out.println(sb);
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////




/////////////////////////////////////////////////////////////////////////////////////////////
//1986번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            int n = Integer.parseInt(br.readLine());
//
//            int result = 1;
//
//            for(int i=2; i<=n; i++){
//                if(i%2==0){
//                    result -= i;
//                }
//                else{
//                    result += i;
//                }
//            }
//
//            sb.append("#").append(test_case).append(" ").append(result).append("\n");
//        }
//
//        System.out.println(sb);
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////



/////////////////////////////////////////////////////////////////////////////////////////////
////1984번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            st = new StringTokenizer(br.readLine(), " ");
//
//            double sum=0;
//            int a=0;
//
//            int[] arr = new int[10];
//
//            for(int i=0; i<10; i++){
//                arr[i] = Integer.parseInt(st.nextToken());
//            }
//
//            Arrays.sort(arr);
//
//            for(int i=1; i<9; i++){
//                sum += arr[i];
//            }
//
//            sb.append("#").append(test_case).append(" ").append(String.format("%.0f", sum/8)).append("\n");
//        }
//
//        System.out.println(sb);
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////



/////////////////////////////////////////////////////////////////////////////////////////////
////1983번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.StringTokenizer;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            st = new StringTokenizer(br.readLine(), " ");
//
//            int N = Integer.parseInt(st.nextToken());
//            int K = Integer.parseInt(st.nextToken());
//
//            Double[] score = new Double[N];
//            String grade[] = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
//
//            double findScore = 0.0;
//            int findIndex = 0;
//
//            for(int i=0; i<N; i++){
//                st = new StringTokenizer(br.readLine(), " ");
//
//                int mScore = Integer.parseInt(st.nextToken());
//                int fScore = Integer.parseInt(st.nextToken());
//                int hScore = Integer.parseInt(st.nextToken());
//
//                score[i] = mScore*0.35 + fScore*0.45 + hScore*0.2;
//            }
//
//            findScore = score[K-1];
//
//            Arrays.sort(score, Collections.reverseOrder());
//
//            for(int i=0; i<score.length; i++){
//                if(score[i]==findScore){
//                    findIndex = i;
//                }
//            }
//
//            findIndex = findIndex/(N/10);
//
//            sb.append("#").append(test_case).append(" ").append(grade[findIndex]).append("\n");
//
//        }
//
//        System.out.println(sb);
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////




/////////////////////////////////////////////////////////////////////////////////////////////
////1979번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            st = new StringTokenizer(br.readLine(), " ");
//
//            int N = Integer.parseInt(st.nextToken());
//            int K = Integer.parseInt(st.nextToken());
//
//            int[][] arr = new int[N][N];
//
//            for(int i=0; i<N; i++){
//                st = new StringTokenizer(br.readLine(), " ");
//
//                for(int j=0; j<N; j++){
//                    arr[i][j] = Integer.parseInt(st.nextToken());
//                }
//            }
//
//            int count = 0;
//            int size;
//
//            //가로
//            for(int i=0; i<N; i++){
//                size=0;
//
//                for(int j=0; j<N; j++){
//                    if(arr[i][j] == 1){
//                        size++;
//                    }
//                    else{
//                        if(size==K){
//                            count++;
//                        }
//                        size=0;
//                    }
//                }
//
//                if(size==K){
//                    count++;
//                }
//            }
//
//            //세로
//            for(int i=0; i<N; i++){
//                size = 0;
//
//                for(int j=0; j<N; j++){
//                    if(arr[j][i] == 1){
//                        size++;
//                    }
//                    else{
//                        if(size==K){
//                            count++;
//                        }
//                        size=0;
//                    }
//                }
//
//                if(size==K){
//                    count++;
//                }
//            }
//
//            sb.append("#").append(test_case).append(" ").append(count).append("\n");
//        }
//
//        System.out.println(sb);
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////



///////////////////////////////////////////////////////////////////////////////////////////////
////1976번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            st = new StringTokenizer(br.readLine(), " ");
//
//            int h1 = Integer.parseInt(st.nextToken());
//            int m1 = Integer.parseInt(st.nextToken());
//
//            int h2 = Integer.parseInt(st.nextToken());
//            int m2 = Integer.parseInt(st.nextToken());
//
//            int h;
//            int m;
//
//            if(m1 + m2 == 60){
//                m = 0;
//                h = h1+h2+1;
//            }
//            else if(m1 + m2 > 60){
//                m = m1+m2-60;
//                h = h1+h2+1;
//            }
//            else{
//                m = m1+m2;
//                h = h1+h2;
//            }
//
//            // 13~24
//            if(h>12){
//                h = h-12;
//            }
//
//            sb.append("#").append(test_case).append(" ").append(h).append(" ").append(m).append("\n");
//
//        }
//
//        System.out.println(sb);
//
//    }
//}
///////////////////////////////////////////////////////////////////////////////////////////////





///////////////////////////////////////////////////////////////////////////////////////////////
////1974번
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            int[][] arr = new int[9][9];
//            int[] arr2 = new int[9];
//
//            for(int i=0; i<9; i++){
//                st = new StringTokenizer(br.readLine(), " ");
//
//                for(int j=0; j<9; j++){
//                    arr[i][j] = Integer.parseInt(st.nextToken());
//                }
//            }
//
//            int row = 1;
//            int col = 1;
//            int square = 1;
//
//            //가로
//            for(int i=0; i<9; i++){
//                for(int j=0; j<9; j++){
//                    arr2[j] = arr[i][j];
//                }
//
//                Arrays.sort(arr2);
//
//                for(int z=0; z<9; z++){
//                    if(arr2[z] != z+1){
//                        row = 0;
//                        break;
//                    }
//                }
//            }
//
//            //세로
//            for(int i=0; i<9; i++){
//                for(int j=0; j<9; j++){
//                    arr2[j] = arr[j][i];
//                }
//
//                Arrays.sort(arr2);
//
//                for(int z=0; z<9; z++){
//                    if(arr2[z] != z+1){
//                        col = 0;
//                        break;
//                    }
//                }
//            }
//
//            //격자
//            for(int i=0; i<9; i+=3){
//                for(int j=0; j<9; j+=3){
//
//                    int index=0;
//
//                    for(int x=0; x<3; x++){
//                        for(int y=0; y<3; y++){
//                            arr2[index++] = arr[i+x][j+y];
//                        }
//                    }
//
//                    Arrays.sort(arr2);
//
//                    for(int z=0; z<9; z++){
//                        if(arr2[z] != z+1){
//                            square = 0;
//                            break;
//                        }
//                    }
//                }
//                if (square == 0) break;
//            }
//
//            if(col==1 && row==1 && square==1){
//                sb.append("#").append(test_case).append(" ").append(1).append("\n");
//            }
//            else{
//                sb.append("#").append(test_case).append(" ").append(0).append("\n");
//            }
//
//        }
//
//        System.out.println(sb);
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////


public class Solution {
    public static void main(String[] args) throws Exception {

    }
}