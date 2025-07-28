import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0, leng = numbers.length;
        Arrays.sort(numbers);
        
        if(numbers[0] * numbers[1] > numbers[leng-1] * numbers[leng-2]){
            answer = numbers[0] * numbers[1];
        }else{
            answer = numbers[leng-1] * numbers[leng-2];
        }
        
        return answer;
    }
}