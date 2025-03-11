class Solution {
	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		String[] sArr = s.split(" ",-1);
		
		for (int i = 0; i < sArr.length; i++) {
			for (int j = 0; j < sArr[i].length(); j++) {
				char c = sArr[i].charAt(j);
				if(j%2==0) answer.append(Character.toUpperCase(c));
				else answer.append(Character.toLowerCase(c));
			}
			if(i < sArr.length-1)
			answer.append(" ");
		}
		return answer.toString();
	}
}