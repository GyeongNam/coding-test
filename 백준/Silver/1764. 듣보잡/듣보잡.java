import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i=0; i<N+M; i++) {
            String str = br.readLine();
            map.put(str, map.getOrDefault(str ,0)+1);
        }
        System.out.println(map.entrySet().stream().filter(a->a.getValue() >= 2).count());
        map.entrySet().stream().filter(a->a.getValue() >= 2).sorted(Map.Entry.comparingByKey()).forEach(a->System.out.println(a.getKey()));
	}
}
