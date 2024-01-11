import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> d = new ArrayDeque<>();

        int size =  Integer.parseInt( br.readLine() );
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < size ; i++) {
            int num1 = Integer.parseInt(st1.nextToken());
            int num2 = Integer.parseInt(st2.nextToken());
            if(num1 == 0){
                d.addLast(num2);
            }
        }
        StringBuilder sb = new StringBuilder();


        int num_size =  Integer.parseInt( br.readLine() );
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        for (int i = 0; i < num_size ; i++) {
            d.addFirst(Integer.parseInt(st3.nextToken()));
        }
        for (int i = 0; i <num_size ; i++) {
            sb.append(d.pollLast()+" ");
        }
        System.out.println(sb);
	}
}
