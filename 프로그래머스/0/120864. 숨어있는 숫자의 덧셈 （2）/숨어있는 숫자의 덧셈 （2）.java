class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[^0-9]", " ");
        
        String [] myStr = my_string.split(" ");
        
        for (int i=0;i<myStr.length;i++) {
            if(!myStr[i].equals("")){
                answer += Integer.valueOf(myStr[i]);
            }
		}
        
        return answer;
    }
}