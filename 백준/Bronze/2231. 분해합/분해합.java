import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int str_length = str.length();

        int N = Integer.parseInt(str);
        int result = 0;

        for(int i = (N - (str_length * 9)); i < N; i++) {
            int number = i;
            int sum = 0;
            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }
            if(sum + i == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
	}
}
