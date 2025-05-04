class Solution {
    public int[] solution(int n) {
        int arrLength = n%2==1 ? n/2+1 : n/2; 
        int[] answer = new int[arrLength];
        
        for(int i=1,cnt=0;i<=n;i+=2,cnt++){
            if(i%2==1) answer[cnt] = i;
        }
        return answer;
    }
}