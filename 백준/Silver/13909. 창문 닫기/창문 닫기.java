import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 1; i*i <= size; i++) {
            count++;
        }
        System.out.println(count);
	}
}
