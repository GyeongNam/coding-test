import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x_size = sc.nextInt();
        int y_size = sc.nextInt();
        int[][] arr = new int[x_size][y_size];
        for(int i = 0; i<x_size; i++){
            for (int j = 0; j < y_size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<x_size; i++){
            for (int j = 0; j < y_size; j++) {
                arr[i][j] += sc.nextInt();
            }
        }
        for (int[] num :arr){
            for(int n : num){
                System.out.println(n);
            }
        }
	}
}
