import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] num = new boolean[1000001];
        num[0] = num[1] = true;
        for (int i = 2; i*i <= 1000000; i++) {
            if (!num[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    num[j] = true;
                }
            }
        }
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            int temp = Integer.parseInt(br.readLine());
            int answer = 0;
            for (int j = 2; j <= temp / 2; j++) {
                if (!num[j] && !num[temp - j])
                    answer++;
            }
            System.out.println(answer);
        }
	}
}
