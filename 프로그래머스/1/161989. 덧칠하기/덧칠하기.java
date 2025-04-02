class Solution {
    public int solution(int n, int m, int[] section) {
        int cnt = 1;
        int sec = section[0] + m - 1;
        for (int i = 1; i < section.length; i++) {
			if(sec < section[i]) {
                sec = section[i] + m - 1;   
                cnt++;
            }
		} // for i
        return cnt;
    }
}