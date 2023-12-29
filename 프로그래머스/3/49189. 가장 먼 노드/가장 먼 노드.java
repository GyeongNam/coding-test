import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;

        boolean[] visited = new boolean[edge.length];
        int[] distance = new int[edge.length];
        ArrayList<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < edge.length; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] e :  edge) {
            list.get(e[0]).add(e[1]);
            list.get(e[1]).add(e[0]);
        }

        bfs(list, visited, distance, 1);

        int max = Arrays.stream(distance).max().getAsInt();
        answer = (int) Arrays.stream(distance).filter(a->a == max).count();

        return answer;
    }
    
    public static void bfs(ArrayList<List<Integer>> list, boolean[] visited, int[] distance, int index){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(index);
        visited[index] = true;
        while (!queue.isEmpty()) {
            int next = queue.poll();
            for(int target : list.get(next)){
                if(!visited[target]){
                    visited[target] = true;
                    distance[target] = distance[next]+1;
                    queue.add(target);
                }
            }
        }
    }
}