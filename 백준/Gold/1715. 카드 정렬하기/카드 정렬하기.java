import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < N; i++) pq.add(Integer.parseInt(br.readLine()));
        int totalCost = 0;
        
        while (pq.size() > 1) {
            int cost = pq.poll() + pq.poll();
            totalCost += cost;
            pq.add(cost);
        }
        
        bw.write(totalCost + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
