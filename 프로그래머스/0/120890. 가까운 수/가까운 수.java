class Solution {
    public int solution(int[] array, int n) {
    	int answer = 100, a = 100;
        
    	for (int i : array) {
            int abs = Math.abs(i-n);
            
            if(a > abs){
                a = abs;
                answer = i;
            }else if(a == abs && i < answer){
                answer = i;
            }
    	}
        
    	return answer;
    }
}
