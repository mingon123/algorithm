class Solution {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);
        return n==Math.pow(sqrt,2) ? (long)Math.pow(sqrt+1, 2) : -1;
    }
}