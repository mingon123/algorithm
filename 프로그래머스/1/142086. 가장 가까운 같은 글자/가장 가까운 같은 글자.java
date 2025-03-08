import java.util.*;

class Solution {
    public static int[] solution(String s) {
        int[] answer = new int [s.length()];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        
			if(s.indexOf(c)==i) answer[i] = -1;
			else answer[i] = i - map.get(c);
			map.put(c, i);
		}
        return answer;
    }
}