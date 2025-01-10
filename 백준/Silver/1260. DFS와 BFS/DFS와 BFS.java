import java.io.*;
import java.util.*;

public class Main {
    static int[][] graph;
    static int N, M, V;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int v, boolean[] visited){
        if(visited[v]){
           return;
        }
        sb.append(v).append(" ");
        visited[v] = true;
        for(int i = 1; i<=N; i++){
            if(!visited[i] && graph[v][i] == 1){
                dfs(i, visited);
            }
        }
    }

    public static void bfs(int v, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;
        while(!q.isEmpty()){
            v = q.poll();
            sb.append(v).append(" ");

            for(int i = 1; i<=N; i++){
                if(!visited[i] && graph[v][i] == 1){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = 1;

        }

        dfs(V, new boolean[N+1]);
        sb.append("\n");
        bfs(V, new boolean[N+1]);
        System.out.println(sb);

    }
}
