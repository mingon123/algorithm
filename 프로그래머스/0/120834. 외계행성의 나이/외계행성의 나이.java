import java.util.*;

class Solution {
    public String solution(int age) {
        char [] alp = {'a','b','c','d','e','f','g','h','i','j'};        
        StringBuilder sb = new StringBuilder();
        String ageStr = String.valueOf(age);
        
        for(int i=0;i<ageStr.length();i++){
            char c = ageStr.charAt(i);
            sb.append(alp[c-'0']);
        }
        
        return sb.toString();
    }
}