class Solution {
    public String solution(int[] food) {
    	StringBuilder sb = new StringBuilder();
        for (int i = 0; i < food.length; i++) {
			if(food[i]/2 > 0) sb.append(String.valueOf(i).repeat(food[i]/2));
		} // for i
    	StringBuilder answer = new StringBuilder(sb);
    	answer.append(0).append(sb.reverse());

        return answer.toString();
    }
}