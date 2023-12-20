import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 2; i <= Math.sqrt(N); i++) {	// 또는 i * i <= N
            while(N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }

        if(N != 1) {
            System.out.println(N);
        }
	}
}
