import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> mapx = new HashMap<>();
        Map<Integer, Integer> mapy = new HashMap<>();
        int x = 0,y = 0;
        int size = sc.nextInt();
        for (int i = 0; i<size; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            mapx.put(x, mapx.getOrDefault(x, 0)+1);
            mapy.put(y, mapy.getOrDefault(y, 0)+1);
        }
        int x_min = Integer.MAX_VALUE;
        int x_max = Integer.MIN_VALUE;
        int y_min = Integer.MAX_VALUE;
        int y_max = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : mapx.entrySet()) {
            if(entry.getKey() > x_max ){
                x_max = entry.getKey();
            }
            if(entry.getKey() < x_min){
                x_min = entry.getKey();
            }
        }
        for (Map.Entry<Integer, Integer> entry : mapy.entrySet()) {
            if(entry.getKey() > y_max ){
                y_max = entry.getKey();
            }
            if(entry.getKey() < y_min){
                y_min = entry.getKey();
            }
        }
        System.out.println((x_max-x_min)*(y_max-y_min));
	}
}
