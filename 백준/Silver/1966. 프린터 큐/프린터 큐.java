import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			Integer[] arr = new Integer[N];
            
			Queue<Integer> que = new LinkedList<Integer>();
			Queue<Boolean> bool = new LinkedList<Boolean>();
			st = new StringTokenizer(br.readLine());
            
			for(int j = 0; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				arr[j] = num;
				que.offer(num);
				
				if(j == M) bool.offer(true);
				else bool.offer(false);
			}

			Arrays.sort(arr, Collections.reverseOrder());
			int count = 0;
			int index = 0;
            
			while(index < N) {
				if(arr[index] != que.peek()) {
					que.offer(que.peek());
					que.poll();
					bool.offer(bool.peek());
					bool.poll();
				}else {
					if(bool.peek() == true) break;
					que.poll();
					bool.poll();
					index++;
					count++;
				}
			}
			System.out.println(count + 1);
		}
	}
}