import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder Builder = new StringBuilder();
        Deque<Integer> d = new ArrayDeque<>();
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < size ; i++) {
            String[] str = br.readLine().split(" ");
            if(str[0].equals("push")){
                d.addLast(Integer.parseInt(str[1]));
            }else if(str[0].equals("pop")){
                if(d.isEmpty()){
                    Builder.append("-1").append("\n");
                }else{
                    Builder.append(d.pollFirst()).append("\n");
                }
            }else if(str[0].equals("size")){
                Builder.append(d.size()).append("\n");
            }else if(str[0].equals("empty")){
                if(d.isEmpty()){
                    Builder.append("1").append("\n");
                }else{
                    Builder.append("0").append("\n");
                }
            }else if(str[0].equals("front")){
                if(d.isEmpty()){
                    Builder.append("-1").append("\n");
                }else{
                    Builder.append(d.peekFirst()).append("\n");
                }
            }else if(str[0].equals("back")){
                if(d.isEmpty()){
                    Builder.append("-1").append("\n");
                }else{
                    Builder.append(d.peekLast()).append("\n");
                }
            }
        }
        System.out.println(Builder);
	}
}
