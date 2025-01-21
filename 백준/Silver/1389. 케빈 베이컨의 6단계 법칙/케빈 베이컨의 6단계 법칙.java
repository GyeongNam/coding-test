import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        int min = Integer.MAX_VALUE;
        int answer = -1;
        
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            
            int[] dist = new int[N + 1];
            Arrays.fill(dist, -1);
            dist[i] = 0;

            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);

            while (!queue.isEmpty()) {
                int current = queue.poll();
                for (int next : graph[current]) {
                    if (dist[next] == -1) {
                        dist[next] = dist[current] + 1;
                        queue.offer(next);
                    }
                }
            }

            for (int j = 1; j <= N; j++) {
                sum += dist[j];
            }

            if (sum < min) {
                min = sum;
                answer = i;
            }
        }

        System.out.println(answer);
    }
}
