import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long max = sc.nextLong();
        int size = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < size; i++) {
            long item = sc.nextLong();
            int item_size = sc.nextInt();
            sum += item * item_size;
        }
        if(sum==max){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}
}
