import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size ; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }
        int index = 1;
        while (!queue.isEmpty()){
            if(queue.peek() == index){
                queue.poll();
                index++;
            }else if (!stack.isEmpty() && stack.peek() == index){
                stack.pop();
                index++;
            }else{
                stack.push(queue.poll());
            }
        }
        while (!stack.isEmpty()){
            if(stack.peek() == index){
                stack.pop();
                index++;
            }else{
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
	}
}
