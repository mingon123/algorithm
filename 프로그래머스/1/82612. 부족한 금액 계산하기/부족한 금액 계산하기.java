class Solution {
    public long solution(int price, int money, int count) {
        long mm = 0;
    	for (int i = 1; i < count+1; i++) {
    		mm += price*i;
		} // for i
        return mm>money ? mm-money : 0;        
    }
}