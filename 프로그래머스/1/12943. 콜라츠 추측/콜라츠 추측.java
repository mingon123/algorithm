class Solution {
    public int solution(int num) {  
        long numb = (long)num;
        
        for(int i=0;i<500;i++) {
            if(numb==1) return i;
            
        	if(numb%2==0) numb /= 2;
        	else numb = numb * 3 + 1;
        }
        return -1;
    }
}