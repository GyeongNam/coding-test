import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
    Queue<Integer> minHeap = new PriorityQueue<>(); 
	Queue<Integer> maxHeap = new PriorityQueue<>();
	for (int i = 0; i < operations.length; i++) {
	    if (operations[i].charAt(0) == 'I') { 
	        int data = Integer.parseInt(operations[i].split(" ")[1]);
		    minHeap.add(data);
		    maxHeap.add(-data); 
	    } else if (!minHeap.isEmpty() && operations[i].equals("D 1")) { 
		    minHeap.remove(-maxHeap.poll()); 
        } else if (!minHeap.isEmpty() && operations[i].equals("D -1")) {  
		    maxHeap.remove(-minHeap.poll()); 
        }
	}
        
	return minHeap.isEmpty() ? new int[] {0, 0} : new int[] {-maxHeap.poll(), minHeap.poll()};
    
    }
}