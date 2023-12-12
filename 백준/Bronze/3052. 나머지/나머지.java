import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[42];
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if((a%42) >= 0){
                arr[(a%42)]++;
            }
        }
        System.out.println(Arrays.stream(arr).filter(a->a != 0).count());
	}
}
