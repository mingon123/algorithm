class Solution {
	public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>1) {
            if(n<a) break;
            
        	answer += n/a*b;
        	n = n/a*b + n%a;        	
        }
        return answer;
    }
}