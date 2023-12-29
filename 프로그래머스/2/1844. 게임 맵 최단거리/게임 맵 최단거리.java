import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = 0;

        int[][] visited = new int[maps.length][maps[0].length];

        bfs(maps, visited);
        answer = visited[maps.length-1][maps[0].length-1];

        if(answer == 0){
            answer = -1;
        }
        System.out.println(answer);
        return answer;
    }
    
    public static void bfs(int[][] maps, int[][] visited){
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        int x = 0;
        int y = 0;
        
        visited[x][y] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int cX = current[0];
            int cY = current[1];

            for(int i = 0; i < 4; i++){
                int target_x = cX + dx[i];
                int target_y = cY + dy[i];

                if(target_x < 0 || 
                   target_x > maps.length-1 || 
                   target_y < 0 || 
                   target_y > maps[0].length-1
                  ){
                    continue;
                }

                if(visited[target_x][target_y] == 0 && maps[target_x][target_y] == 1){
                    visited[target_x][target_y] = visited[cX][cY] + 1;
                    queue.add(new int[]{target_x, target_y});
                }
            }
        }
    }
}