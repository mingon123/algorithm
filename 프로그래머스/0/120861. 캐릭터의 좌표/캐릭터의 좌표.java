class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0, y = 0;
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        for(String s : keyinput){
            int bx = x, by = y;
            
            if(s.equals("left")) bx = x-1;
            else if(s.equals("right")) bx = x+1;
            else if(s.equals("up")) by = y+1;
            else if(s.equals("down")) by = y-1;
            
            if(Math.abs(bx) <= maxX && Math.abs(by) <= maxY) {
                x = bx; 
                y = by;
            }
        }
        
        return new int[]{x,y};
    }
}