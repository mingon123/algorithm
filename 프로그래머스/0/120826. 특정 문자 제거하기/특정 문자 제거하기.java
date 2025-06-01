class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<my_string.length();i++){
        	String c = String.valueOf(my_string.charAt(i));
			if(!letter.equals(c)) {
				sb.append(c);
			}
		}
        
        return sb.toString();
    }
}