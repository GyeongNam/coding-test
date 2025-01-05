import java.io.*;

public class Main {
    
    public static StringBuilder sb = new StringBuilder();
    
    public static void hanoi_top(int N, int start, int mid, int to) {
        if (N == 1) {
            sb.append(start).append(" ").append(to).append("\n");
            return;
        }

        hanoi_top(N - 1, start, to, mid);
        sb.append(start).append(" ").append(to).append("\n");
        hanoi_top(N - 1, mid, start, to);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        sb.append((int) (Math.pow(2, N) - 1)).append('\n');

        hanoi_top(N, 1, 2, 3);
        System.out.println(sb);
    }
}