import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0; i<5; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println((int)list.stream().mapToInt(a -> a)
                .average().orElse(0));
        System.out.println(list.get(2));
	}
}
