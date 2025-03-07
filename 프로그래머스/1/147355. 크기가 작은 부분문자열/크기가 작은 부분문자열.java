class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i < t.length()-p.length()+1; i++) {
			String newT = t.substring(i, i+p.length());
			if(newT.compareTo(p)<=0) answer++;
		} // for i
        return answer;
    }
}