class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String sl = s.toLowerCase();
        int y = 0;
        int p = 0;
        
        for (int i = 0; i < sl.length(); i++) {
			if(sl.charAt(i) == 'y') y++;
			else if(sl.charAt(i) == 'p') p++;
		}
        if(y!=p) answer = false;

        return answer;
    }
}