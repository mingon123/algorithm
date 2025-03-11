class Solution {
    public String solution(String phone_number) {
    	int length = phone_number.length()-4;
    	StringBuilder sb = new StringBuilder();
        
    	for (int i = 0; i < length; i++) {
			sb.append('*');
		} // for i
    	
    	sb.append(phone_number.substring(length));
    	
    	return sb.toString();    	
    }
}