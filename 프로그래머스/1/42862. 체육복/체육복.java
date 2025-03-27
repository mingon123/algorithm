import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
    	Arrays.sort(lost);
    	Arrays.sort(reserve);
    	
        int answer = n-lost.length;
        for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if(answer<n) {
					if(lost[i]==reserve[j]) {
						answer++;
						reserve[j] = -1;
						lost[i] = -1;
					}
				}
			} // for j
		} // for i
        
        for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if(answer<n) {
					if(lost[i]+1==reserve[j] || lost[i]-1==reserve[j]) {
						answer++;
						reserve[j] = -1;
						lost[i] = -1;
					}
				}
			} // for j
		} // for i

        return answer;
    }
}