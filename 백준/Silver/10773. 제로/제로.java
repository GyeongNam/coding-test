import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int size = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("0")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(command));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()){
            sum += stack.pop();
        }
        System.out.println(sum);
	}
}
