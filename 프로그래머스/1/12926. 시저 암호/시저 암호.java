class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : s.toCharArray()) {
			if(c == ' ') answer.append(c);
			else {
				char isC = Character.isUpperCase(c) ? 'A' : 'a'; 
				answer.append((char)((c-isC+n)%26+isC));
			}
		} // for i
        return answer.toString();
    }
}