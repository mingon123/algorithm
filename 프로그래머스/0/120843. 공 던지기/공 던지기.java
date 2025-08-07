class Solution {
    public int solution(int[] numbers, int k) {
        int cnt = k * 2 - 2;
        
        while(cnt > numbers.length){
            cnt -= numbers.length;
        }
        
        return numbers[cnt];
    }
}