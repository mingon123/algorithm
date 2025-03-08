class Solution {
    public long solution(long n) {
        long answer = 0;
        long a = 0;
        
        long sqrt = (long) Math.sqrt(n);
        if(n == sqrt * sqrt) a = sqrt;
        else return -1;
        answer = (a+1) * (a+1);
        		
        return answer;
    }
}