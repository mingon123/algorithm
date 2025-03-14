class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n>=1) {
        	sb.append(n%3);
        	n/=3;
        }
        sb.reverse();
        
        for (int i = 0, num = 1; i < sb.length(); i++, num*=3) {
			int c = sb.charAt(i) - '0';
			answer+=c*num;
		} // for i
        return answer;
    }
}