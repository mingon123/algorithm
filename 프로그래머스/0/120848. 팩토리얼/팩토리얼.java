class Solution {
    public int solution(int n) {
        int answer = 1;
        
        while(answer <= n){
            n /= answer;
            answer++;
        }
        
        return answer - 1;
    }
}