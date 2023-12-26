import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> set = new HashSet<>();

        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            if(str[1].equals("enter")){
                set.add(str[0]);
            }else if(str[1].equals("leave")){
                set.remove(str[0]);
            }
        }
        set.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);
	}
}
