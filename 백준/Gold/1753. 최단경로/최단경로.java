import java.io.*;
import java.util.*;

public class Main {
    static class Node implements Comparable<Node> {
        int vertex, weight;
        
        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
        
        @Override
        public int compareTo(Node other) {
            return this.weight - other.weight;
        }
    }
    
    public static int[] dijkstra(int V, int K, ArrayList<Node>[] graph) {
        // 최단 거리 테이블 초기화
        int[] distance = new int[V + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[K] = 0;
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        // 시작 노드 정보 우선순위 큐에 삽입
        pq.offer( new Node(K, 0));
        
        while (!pq.isEmpty()) {
            // 가장 최단 거리가 짧은 노드 정보 꺼내기
            Node current = pq.poll();
            
            // 현재 노드의 최단 거리가 이미 더 짧은 경우 무시
            if (distance[current.vertex] < current.weight) {
                continue;
            }
            
            // 현재 노드와 연결된 다른 노드들 확인
            for (Node next : graph[current.vertex]) {
                int cost = distance[current.vertex] + next.weight;
                
                // 현재 노드를 거쳐서 다른 노드로 이동하는 거리가 더 짧은 경우
                if (cost < distance[next.vertex]) {
                    distance[next.vertex] = cost;
                    pq.offer(new Node(next.vertex, cost));
                }
            }
        }
        return distance;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());
        
        ArrayList<Node>[] graph = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new Node(v, w));
        }
        
        int[] result = dijkstra(V, K, graph);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= V; i++) {
            if (result[i] == Integer.MAX_VALUE) {
                sb.append("INF\n");
            } else {
                sb.append(result[i]).append("\n");
            }
        }
        System.out.print(sb);
    }
}