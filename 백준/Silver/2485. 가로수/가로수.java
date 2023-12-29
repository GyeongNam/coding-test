import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        long num = 0;
        for(int i=0;i<N-1;i++){
            int distance = arr[i+1] - arr[i];
            num = gcd(distance,num);
        }
        System.out.println((arr[N-1]-arr[0])/num+1-(arr.length));
	}
    static long gcd(long a, long b){
        if(a<b){
            long temp = a;
            a = b;
            b = temp;
        }
        while (b!=0){
            long temp2 = a%b;
            a = b;
            b = temp2;
        }
        return a;
    }
}
