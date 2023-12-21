import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N, M;
        N = sc.nextInt();
        M = sc.nextInt();
        int sum = 0;
        int result = 0;

        int arr[] = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                for(int k=j+1; k<N; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if(result < sum && sum <= M)
                        result = sum;
                }
            }
        }
        System.out.println(result);
	}
}
