import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int [] first = {1, 2, 3, 4, 5};
        int [] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; 
        int [] students = new int[3];

        for (int i = 0; i < answers.length; i++) {
        	if(answers[i]==first[i%first.length]) students[0]++;
        	if(answers[i]==second[i%second.length]) students[1]++;
        	if(answers[i]==third[i%third.length]) students[2]++;       	   	
		} // for i
                
        int maxValue = Math.max(students[0], Math.max(students[1], students[2]));
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
        	if(students[i]==maxValue) list.add(i+1);
		} // for i
        
        return list.stream().mapToInt(i->i).toArray();
    }
}