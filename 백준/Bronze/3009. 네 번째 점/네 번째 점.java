import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> mapx = new HashMap<>();
        Map<Integer, Integer> mapy = new HashMap<>();
        for (int i = 0; i<3; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            mapx.put(x, mapx.getOrDefault(x, 0)+1);
            mapy.put(y, mapy.getOrDefault(y, 0)+1);
        }
        int x = 0;
        int y = 0;

        for (Map.Entry<Integer, Integer> entry : mapx.entrySet()) {
            if(entry.getValue() < 2 ){
                x = entry.getKey();
            }
        }
        for (Map.Entry<Integer, Integer> entry : mapy.entrySet()) {
            if(entry.getValue() < 2 ){
                y = entry.getKey();
            }
        }
        System.out.println(x+" "+y);
	}
}
