class Solution {
    public int solution(String before, String after) {
        
        for(int i=0;i<before.length();i++){
            String s = String.valueOf(before.charAt(i));
            if(after.contains(s)) after = after.replaceFirst(s,"");
            else break;
        }
        
        return "".equals(after) ? 1 : 0;
    }
}