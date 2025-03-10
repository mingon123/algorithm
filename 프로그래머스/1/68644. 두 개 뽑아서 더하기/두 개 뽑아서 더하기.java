import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
			for (int j = 1; j < numbers.length; j++) {
				if(!(i==j) && !list.contains(numbers[i] + numbers[j])) {
					list.add(numbers[i] + numbers[j]);
				}
			} // for j
		} // for i
        list.sort(null);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}