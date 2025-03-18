package KB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Prepare {

    public static void main(String[] args) throws Exception {
        Prepare prepare = new Prepare();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[][] arr = new int[5][5];
//        for(int i=0; i<5; i++){
//            StringTokenizer st = new StringTokenizer(br.readLine(), "");
//            for(int j=0; j<5; j++){
//                arr[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        sb.append(Arrays.toString(arr));
//        System.out.println(sb);

        int[][] maps = {
                {1, 1, 0, 1, 1},
                {1, 0, 1, 1, 0},
                {1, 1, 1, 0, 1},
                {0, 1, 0, 1, 1},
                {1, 1, 1, 1, 1}
        };

        int result = prepare.solution(maps);
        System.out.println("최단 거리: " + result);
    }


    Queue<Node> queue;
    boolean[][] visited;

    int[] dx = {0, 0, -1, 1};
    int[] dy = {1, -1, 0, 0};


    public int solution(int[][] maps) {

        queue = new LinkedList<>();
        visited = new boolean[maps.length][maps[0].length];

        return bfs(0, 0, 1, maps);
    }

    class Node {
        int x;
        int y;
        int distance;

        Node(int x, int y, int distance){
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

    public int bfs(int x, int y, int distance, int[][] maps){
        Node startNode = new Node(x, y, distance);
        queue.add(startNode);

        while(!queue.isEmpty()){
            Node currentNode = queue.poll();

            if(currentNode.x == maps.length-1 && currentNode.y == maps[0].length-1){
                return currentNode.distance;
            }

            for(int i=0; i<4; i++){
                int nextX = currentNode.x + dx[i];
                int nextY = currentNode.y + dy[i];

                if(nextX>=0 && nextX<maps.length && nextY>=0 && nextY<maps[0].length){
                    if(!visited[nextX][nextY] && maps[nextX][nextY] != 0) {
                        visited[nextX][nextY] = true;
                        queue.add(new Node(nextX, nextY, currentNode.distance+1));
                    }
                }
            }
        }

        return -1;
    }


//     public void dfs(int x, int y, int[][] maps, int distance){
//         if(x==maps.length-1 && y==maps[0].length-1){
//             distance++;
//             list.add(distance);
//             return;
//         }

//         for(int i=0; i<4; i++){
//             int nextX = x + dx[i];
//             int nextY = y + dy[i];

//             if(nextX>=0 && nextX<maps.length && nextY>=0 && nextY<maps[0].length){
//                 if(maps[nextX][nextY] != 0 && !visited[nextX][nextY]){
//                     visited[nextX][nextY] = true;
//                     dfs(nextX, nextY, maps, distance+1);
//                     visited[nextX][nextY] = false;
//                 }
//             }
//         }
//     }
}

