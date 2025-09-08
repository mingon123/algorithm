import java.util.*;

class Solution {
    public String solution(String s) {
        String answer;
        String[] sArr = s.split(" ");
        int[] nums = new int[sArr.length];
        
        for(int i=0;i<sArr.length;i++){
            nums[i] = Integer.parseInt(sArr[i]);
        }
        
        Arrays.sort(nums);
        
        answer = nums[0] + " " + nums[sArr.length - 1];
            
        return answer;
    }
}