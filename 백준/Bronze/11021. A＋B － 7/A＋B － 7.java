import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #"+(i+1)+": "+(a+b));
        }
	}
}
