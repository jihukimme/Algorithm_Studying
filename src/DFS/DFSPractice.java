package DFS;

import java.util.ArrayList;

public class DFSPractice {
    static String numbers = "17";

    static ArrayList<String> list = new ArrayList<>();
    static boolean[] visited = new boolean[numbers.length()];

    public static void main(String[] args) {
        dfs(0, numbers, "");

        System.out.println(list);
    }

    static void dfs(int depth, String numbers, String s) {
        if (depth == numbers.length()) {
            return;
        }

        for(int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                list.add(s + numbers.charAt(i));
                dfs(depth + 1, numbers, s + numbers.charAt(i));
                visited[i] = false;
            }
        }
    }
}

