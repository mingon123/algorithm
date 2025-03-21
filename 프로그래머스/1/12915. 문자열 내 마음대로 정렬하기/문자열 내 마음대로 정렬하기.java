import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();
        for (String string : strings) list.add(string.charAt(n) + "," + string);
        list.sort(null);
        
        String[] answer = new String[strings.length];
        for(int i=0;i<list.size();i++) {
			answer[i] = list.get(i).split(",")[1];
		} // foreach        
        return answer;
    }
}