import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> map = new HashMap<>();
        
        for (String part : participant) map.put(part, map.getOrDefault(part, 0) + 1);
        for (String com : completion) {
        	if(map.get(com)==1) map.remove(com);
        	else map.put(com, map.get(com) - 1);
        }
        
        return map.keySet().iterator().next();
    }
}