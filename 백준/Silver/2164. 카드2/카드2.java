import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        int size = Integer.parseInt(br.readLine());
        for(int i = 1; i<=size; i++){
            q.offer(i);
        }
        while (q.size()>1){
            q.poll();
            q.offer(q.poll());
        }
        System.out.println(q.peek());
	}
}
