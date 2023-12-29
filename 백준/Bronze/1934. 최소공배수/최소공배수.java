import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());
        for(int i = 0; i<size; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(a*b/gdc(a,b));
        }
	}
    
    static int gdc(int a, int b){
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        while (b!=0){
            int temp2 = a%b;
            a = b;
            b = temp2;
        }
        return a;
    }
}
