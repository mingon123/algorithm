class Solution {
    public int solution(int[] sides) {
        int answer = 0, max,min;
        
        if(sides[0] > sides[1]){
            max = sides[0];
            min = sides[1];
        }else{
            max = sides[1];
            min = sides[0];
        }
        
        for(int i=max-min;i<max+min-1;i++){
            answer++;
        }
        
        return answer;
    }
}