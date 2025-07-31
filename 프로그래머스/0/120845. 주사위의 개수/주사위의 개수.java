class Solution {
    public int solution(int[] box, int n) {
        int answer = 0, boxX, boxY, boxZ;
        boxX = box[0] / n;
        boxY = box[1] / n;
        boxZ = box[2] / n;
        
        answer = boxX * boxY * boxZ;
        
        return answer;
    }
}