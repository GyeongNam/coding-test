import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine()); 
        
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine()); 
            TreeMap<Integer, Integer> map = new TreeMap<>();
            
            for (int j = 0; j < n; j++) {
                String[] parts = br.readLine().split(" ");
                String command = parts[0];
                int value = Integer.parseInt(parts[1]);
                
                if (command.equals("I")) {
                    map.put(value, map.getOrDefault(value, 0) + 1);
                } else if (command.equals("D")) {
                    if (!map.isEmpty()) {
                        if (value == 1) {
                            int maxKey = map.lastKey();
                            if (map.get(maxKey) == 1) {
                                map.pollLastEntry();
                            } else {
                                map.put(maxKey, map.get(maxKey) - 1);
                            }
                        } else if (value == -1) {
                            int minKey = map.firstKey();
                            if (map.get(minKey) == 1) {
                                map.pollFirstEntry();
                            } else {
                                map.put(minKey, map.get(minKey) - 1);
                            }
                        }
                    }
                }
            }
            
            if (map.isEmpty()) {
                out.println("EMPTY");
            } else {
                out.println(map.lastKey() + " " + map.firstKey());
            }
        }
        
        out.flush();
    }
}
