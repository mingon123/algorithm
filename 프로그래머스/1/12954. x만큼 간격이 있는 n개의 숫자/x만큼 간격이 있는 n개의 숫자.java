class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int a = 0;
        for (long i = x; a < n; i+=x) {
			answer[a++] = i;
		}
        return answer;
    }
}