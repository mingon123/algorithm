import java.util.*;

class Solution {
    public long solution(long n) {
    	String s = n + "";
    	char[] sArr = s.toCharArray();
    	Arrays.sort(sArr);
    	StringBuilder sb = new StringBuilder(String.valueOf(sArr));
    	sb.reverse();
    	return Long.parseLong(sb.toString());   
    }
}