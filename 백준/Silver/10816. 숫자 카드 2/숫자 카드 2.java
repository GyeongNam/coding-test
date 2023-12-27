import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            int str = Integer.parseInt(st.nextToken());
            map.put(str, map.getOrDefault(str,0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i=0; i<M; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(map.get(num) == null ? "0 " : map.get(num)+" ");
        }
        System.out.println(sb);
	}
}
