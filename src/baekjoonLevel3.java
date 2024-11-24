import java.io.*;
import java.util.StringTokenizer;

//class multiplicationTable {
//    public void multiplicationTable() {
//
//    }
//
//    public void multiplicationTable(int num) {
//        for(int i=0; i<9; i++){
//            System.out.println(num + " * " + (i + 1) + " = " + num*(i+1));
//        }
//    }
//}

//class plus {
//
//    public void plus() throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //scanner
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //print
//
//        StringBuilder sb = new StringBuilder(); //make string
//
//        int num = Integer.parseInt(br.readLine());
//
//        int x;
//        int y;
//
//        for(int i=0; i<num; i++){
//            StringTokenizer st = new StringTokenizer(br.readLine(), " "); //string tokenizer
//
//            x = Integer.parseInt(st.nextToken());
//            y = Integer.parseInt(st.nextToken());
//
//            sb.append(x + y);
//            sb.append("\n");
//        }
//
//        bw.write(String.valueOf(sb));
//        bw.newLine();
//
//        bw.flush();
//    }
//}

//class plus2 {
//    public void plus2() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //scanner
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //print
//
////        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        StringBuilder sb = new StringBuilder(); //make string
//
//        int num = Integer.parseInt(br.readLine());
//        int sum = 0;
//
//        for(int i=0; i<num; i++){
//            sum = sum + (i+1);
//        }
//
////        sb.append(sum);
//
//        bw.write(String.valueOf(sum));
//        bw.flush();
//    }
//}

//class receipt {
//    public void receipt() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //scanner
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //print
//
////        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        int totalMoney;
//        int n;
//        int itemMoney;
//        int itemCount;
//        int compareMoney = 0;
//
//        totalMoney = Integer.parseInt(br.readLine());
//        n = Integer.parseInt(br.readLine());
//
//        for(int i=0; i<n; i++){
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//            itemMoney = Integer.parseInt(st.nextToken());
//            itemCount = Integer.parseInt(st.nextToken());
//
//            compareMoney = compareMoney + (itemMoney * itemCount);
//        }
//
//        if(totalMoney == compareMoney){
//            bw.write("Yes");
//        } else {
//            bw.write("No");
//        }
//        bw.flush();
//    }
//}

//class dataType {
//    public void dataType() throws IOException {
//        // long int = 4바이트
//        // long long int = 8바이트
//        // long long long int = 12바이트
//        // long long long long int = 16바이트
//        // ...
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
////        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        int num = Integer.parseInt(br.readLine());
//
//        int printLong = num/4;
//
//        for(int i=0; i<printLong; i++){
//            sb.append("long ");
//        }
//
//        sb.append("int");
//
//        bw.write(String.valueOf(sb));
//        bw.flush();
//    }
//}

//class fastPlus {
//    public void fastPlus() throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
////        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        int num = Integer.parseInt(br.readLine());
//
//        int a;
//        int b;
//
//        for(int i=0; i<num; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//            a = Integer.parseInt(st.nextToken());
//            b = Integer.parseInt(st.nextToken());
//
//            sb.append(a + b);
//            sb.append("\n");
//        }
//
//        bw.write(String.valueOf(sb));
//        bw.flush();
//
//    }
//}

//class newPlus {
//    public void newPlus() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
////        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        int num = Integer.parseInt(br.readLine());
//
//        int a;
//        int b;
//
//        for(int i=0; i<num; i++){
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//            a = Integer.parseInt(st.nextToken());
//            b = Integer.parseInt(st.nextToken());
//
//            sb.append("Case #" + (i+1) + ": " + a + " " + "+ " + b + " " + "= ");
//            sb.append(a + b);
//            sb.append("\n");
//        }
//
//        bw.write(String.valueOf(sb));
//        bw.flush();
//    }
//}

//class star1 {
//    public void star1() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
////        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        int num = Integer.parseInt(br.readLine());
//
//        for(int i=0; i<num; i++){
//            sb.append("*");
//
//            for(int j = 0; j < i; j++){
//                sb.append("*");
//            }
//            sb.append("\n");
//        }
//
//        bw.write(String.valueOf(sb));
//        bw.flush();
//
//    }
//}

//class star2 {
//    public void star2() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
////        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        int num = Integer.parseInt(br.readLine());
//
//        for(int i=0; i<num; i++) {
//            for(int j=i+1; j<num; j++){
//                sb.append(" ");
//            }
//            for(int z=0; z<=i; z++){
//                sb.append("*");
//            }
//            sb.append("\n");
//        }
//
//        bw.write(String.valueOf(sb));
//        bw.flush();
//    }
//}

//class plus5 {
//    public void plus5() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
////        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        StringBuilder sb = new StringBuilder();
//
//        int a;
//        int b;
//
//        do{
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//            a = Integer.parseInt(st.nextToken());
//            b = Integer.parseInt(st.nextToken());
//
//            if(a != 0 && b !=0){
//                sb.append(a+b);
//                sb.append("\n");
//            }
//
//        }while(a != 0 && b != 0);
//
//
//        bw.write(String.valueOf(sb));
//        bw.flush();
//    }
//}

//class plus4 {
//    public void plus4() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
////        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        String str;
//
//        while((str = br.readLine()) != null){
//            StringTokenizer st = new StringTokenizer(str, " ");
//
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//
//            sb.append(a + b);
//            sb.append("\n");
//        }
//
//        bw.write(String.valueOf(sb));
//        bw.flush();
//    }
//}

public class baekjoonLevel3 {

    public static void main(String[] args) throws IOException {

//        plus4 plus = new plus4();
//        plus.plus4();

    }
}
