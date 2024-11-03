import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;

        boolean[][] visited = new boolean[maps.length][maps[0].length];

        bfs(maps, visited);
        answer = maps[maps.length - 1][maps[0].length - 1];

        if (answer == 1) {
            answer = -1;
        }
        System.out.println(answer);
        return answer;
    }

    public static void bfs(int[][] maps, boolean[][] visited) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int x = 0;
        int y = 0;

        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cX = current[0];
            int cY = current[1];

            for (int i = 0; i < 4; i++) {
                int target_x = cX + dx[i];
                int target_y = cY + dy[i];

                // 범위 확인
                if (target_x < 0 || target_x >= maps.length || 
                    target_y < 0 || target_y >= maps[0].length) {
                    continue;
                }

                if (!visited[target_x][target_y] && maps[target_x][target_y] == 1) {
                    visited[target_x][target_y] = true;
                    maps[target_x][target_y] = maps[cX][cY] + 1;
                    queue.add(new int[]{target_x, target_y});
                }
            }
        }
    }
}
