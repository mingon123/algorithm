class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i=num_list.length-1, a=0;i>=0;i--,a++){
            answer[a] = num_list[i];
        }
        
        return answer;
    }
}