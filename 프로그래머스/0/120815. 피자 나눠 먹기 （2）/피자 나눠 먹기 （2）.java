class Solution {
    public int solution(int n) {
        int num = 1;
        
        while(6 * num % n != 0){
            if(6 * num % n == 0){
                return num;
            }    
            num++;
        }
        return num;
    }
}