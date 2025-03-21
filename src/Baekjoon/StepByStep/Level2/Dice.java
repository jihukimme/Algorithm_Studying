package Baekjoon.StepByStep.Level2;

public class Dice {
    public void dice(int[] arr) {
        int money;
        int sameNum;
        int max = 0;

        for (int i = 0; i < 3; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // 같은 눈이 3개 나오면
        if (arr[0] == arr[1] && arr[0] == arr[2]) {
            sameNum = arr[0];
            money = 10000 + sameNum * 1000;
        }
        // 같은 눈이 두 개이면
        else if (arr[0] == arr[1] || arr[0] == arr[2]) {
            sameNum = arr[0];
            money = 1000 + sameNum * 100;
        } else if (arr[1] == arr[2]) {
            sameNum = arr[1];
            money = 1000 + sameNum * 100;
        }
        // 모두 다른 눈이 나오는 경우
        else {
            money = max * 100;
        }

        System.out.println(money);
    }
}
