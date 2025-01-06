import java.io.*;

public class Main {

    public static long sum(long n) {
        long result = 0;
        long current = 1;
        while (current <= n) {
            long next = current * 10;
            long digit = (n / current) % 10;

            result += (n / next) * current * 45;
            result += (digit * (digit - 1) / 2) * current;
            result += (n % current + 1) * digit;

            current *= 10;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long L = Long.parseLong(input[0]);
        long U = Long.parseLong(input[1]);

        long answer = sum(U) - sum(L - 1);

        System.out.println(answer);
    }
}
