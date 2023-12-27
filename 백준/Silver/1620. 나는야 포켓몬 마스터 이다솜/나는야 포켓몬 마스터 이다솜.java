import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> map_int = new HashMap<>();
        HashMap<String, Integer> map_str = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            map_int.put(i, name);
            map_str.put(name, i);
        }
        for (int i = 0; i < M; i++){
            String str = br.readLine();
            if(49 <= str.charAt(0) && str.charAt(0) <= 57) {
                // 숫자
                sb.append(map_int.get(Integer.parseInt(str))+"\n");
            }else {
                // 문자
                sb.append(map_str.get(str)+"\n");
            }
        }
        System.out.println(sb);
	}
}
