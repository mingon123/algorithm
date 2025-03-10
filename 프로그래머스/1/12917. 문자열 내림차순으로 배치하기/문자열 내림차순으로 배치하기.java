import java.util.*;

class Solution {
    public String solution(String s) {
    	char [] cArr = s.toCharArray();
    	Arrays.sort(cArr);
    	
    	StringBuilder sb = new StringBuilder(String.valueOf(cArr)).reverse();
    	return sb.toString();
    }
}