class Solution {
    public int solution(String s) {
        String [] value = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for (int i = 0; i < value.length; i++) {
			s = s.replace(value[i], String.valueOf(i));
		} // for i
    	
        return Integer.parseInt(s);
    }
}