import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0, x = 0, y = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               arr[i][j] = sc.nextInt();
               if(max <= arr[i][j]){
                   max = arr[i][j];
                   x = i+1;
                   y = j+1;
               }
            }
        }
        System.out.println(max);
        System.out.println(x);
        System.out.println(y);
	}
}
