import java.util.*;
public class Main {
	public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,8};
        int[] new_arr = new int[arr.length];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<new_arr.length; i++){
            new_arr[i] = arr[i]-sc.nextInt() ;
        }
        for(int n : new_arr){
            System.out.println(n);
        }
	}
}
