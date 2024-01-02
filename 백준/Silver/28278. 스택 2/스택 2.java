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

            if(command.equals("1")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if(command.equals("2")) {
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(stack.peek()).append("\n");
                    stack.pop();
                }
            } else if(command.equals("3")) {
                sb.append(stack.size()).append("\n");
            } else if(command.equals("4")) {
                if(stack.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            } else if(command.equals("5")) {
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(stack.peek()).append("\n");
                }
            }
        }
        System.out.println(sb);
	}
}
