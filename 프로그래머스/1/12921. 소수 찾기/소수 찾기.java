class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
			if(isPrime(i)) answer++;
		} // for i

        return answer;
    }

	private static boolean isPrime(int n) {
		for (int i = 2; i*i <= n; i++) {
			if(n % i == 0) return false;
		} // for i
		return true;
	}
}