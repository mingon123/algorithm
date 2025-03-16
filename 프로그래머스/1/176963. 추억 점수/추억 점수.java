import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
    	List<Integer> list = new ArrayList<>();
    	Map<String, Integer> map = new HashMap<>();
    	for (int i = 0; i < name.length; i++) map.put(name[i], yearning[i]);
    	
    	for (String[] pho : photo) {
    		int value = 0;
			for (int i = 0; i < pho.length; i++) {
				value += map.getOrDefault(pho[i],0);				
			} // for i
			list.add(value);
		} // foreach
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}