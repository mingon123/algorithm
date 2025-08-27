class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..", ".---","-.-",".-..","--","-.","---",".--.","--.-", ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        StringBuilder answer = new StringBuilder();
        for(String code : letter.split(" ")){
            for(int i=0;i<morse.length;i++){
                if(morse[i].equals(code)) answer.append((char)('a' + i));
            }
        }
        return answer.toString();
    }
}