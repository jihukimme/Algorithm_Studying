import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//class compare {
//    public void compare() {
//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        if (a > b) {
//            System.out.println(">");
//        } else if (a < b) {
//            System.out.println("<");
//        } else {
//            System.out.println("==");
//        }
//    }
//}

//class grade {
//
//    public void grade(int score) {
//
//        if(score >= 90) {
//            System.out.println("A");
//        }
//        else if(score >= 80) {
//            System.out.println("B");
//        }
//        else if(score >= 70) {
//            System.out.println("C");
//        }
//        else if(score >= 60) {
//            System.out.println("D");
//        }
//        else {
//            System.out.println("F");
//        }
//    }
//}

//class isLeapYear {
//    public void isLeapYear(int year) {
//        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//    }
//}

//class quadrant {
//    public void quadrant(int x, int y) {
//        if (x > 0 && y > 0) {
//            System.out.println(1);
//        } else if (x < 0 && y > 0) {
//            System.out.println(2);
//        } else if (x < 0 && y < 0) {
//            System.out.println(3);
//        } else {
//            System.out.println(4);
//        }
//    }
//}

//class alarm {
//    public void alarm(int hour, int minute) {
//        if(minute >= 45){
//            minute = minute - 45;
//
//            System.out.println(hour + " " + minute);
//        }
//        else {
//            if(hour == 0){
//                hour = 23;
//                minute = 60 - (45 - minute);
//
//                System.out.println(hour + " " + minute);
//            }
//            else{
//                hour = hour - 1;
//                minute = 60 - (45 - minute);
//
//                System.out.println(hour + " " + minute);
//            }
//        }
//    }
//
//}

//class ovenAlarm {
//    public void ovenAlarm(int hour, int minute, int time){
//        int newTime = minute + hour * 60 + time;
//
//        hour = (newTime / 60) % 24;
//        minute = newTime % 60;
//
//        System.out.println(hour + " " + minute);
//
//    }
//}

//class dice {
////    같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
////    같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
////    모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
//    public void dice(int[] arr) {
//        int money;
//        int sameNum;
//        int max = 0;
//
//        for(int i=0; i<3; i++){
//            if(max < arr[i]){
//                max = arr[i];
//            }
//        }
//
//        //같은 눈이 3개 나오면
//        if(arr[0] == arr[1] && arr[0] == arr[2]){
//            sameNum = arr[0];
//            money = 10000 + sameNum * 1000;
//        }
//        //같은 눈이 두개이면
//        else if(arr[0] == arr[1] && arr[0] != arr[2] || arr[0] == arr[2] && arr[0] != arr[1]){
//            sameNum = arr[0];
//            money = 1000 + sameNum * 100;
//        }
//        else if(arr[1] == arr[2] && arr[1] != arr[0]){
//            sameNum = arr[1];
//            money = 1000 + sameNum * 100;
//        }
//        //모두 다른 눈이 나오는 경우
//        else {
//            money = max * 100;
//        }
//
//        System.out.println(money);
//    }
//}


public class baekjoonLevel2 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int hour = Integer.parseInt(st.nextToken());
//        int minute = Integer.parseInt(st.nextToken());
//        int time = Integer.parseInt(br.readLine());
//
//        ovenAlarm newAlarm = new ovenAlarm();
//        newAlarm.ovenAlarm(hour, minute, time);

//        Scanner scanner = new Scanner(System.in);
//
//        int hour = scanner.nextInt();
//        int minute = scanner.nextInt();
//        int time = scanner.nextInt();
//
//        ovenAlarm newAlarm = new ovenAlarm();
//        newAlarm.ovenAlarm(hour, minute, time);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int[] arr = new int[3];
//
//        for(int i=0; i<3; i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        dice diceMoney = new dice();
//        diceMoney.dice(arr);



    }
}
