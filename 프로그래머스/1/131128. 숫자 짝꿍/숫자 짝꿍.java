import java.util.*;

class Solution {
    public String solution(String X, String Y) {
    	int[] xCount = new int[10];
    	int[] yCount = new int[10];
    	
    	for (char c : X.toCharArray()) xCount[c - '0']++;
    	for (char c : Y.toCharArray()) yCount[c - '0']++;
    	
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 0; i <= 9; i++) {
			int count = Math.min(xCount[i], yCount[i]);
			for (int j = 0; j < count; j++) {
				sb.append(i);
			} // for j
		} // for i
    	
    	sb.reverse();
    	if (sb.length() == 0) return "-1";
    	if (sb.toString().replace("0", "").isEmpty()) return "0";

    	return sb.toString();
    }
}