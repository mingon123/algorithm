import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
			if(list.getLast()!=arr[i]) list.add(arr[i]);
		}
		
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}