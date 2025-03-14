class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int i : numbers) sb.append(i);
        
        for (int i = 0; i < 10; i++) {
			if(sb.indexOf(String.valueOf(i))==-1) answer+=i;
		} // for i
        return answer;
    }
}