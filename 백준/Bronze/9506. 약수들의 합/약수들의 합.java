import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			List<Integer> array = new ArrayList<>();
			int sum = 0;
			String result = "";
			int num = Integer.parseInt(bf.readLine());
			if (num == -1) {
				break;
			}
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum += i;
					result += ((sum > 1) ? " + " : "") + i;
					array.add(i);
				}
			}
			System.out.println(num + (sum == num ? " = " + result : " is NOT perfect."));
        }
	}
}
