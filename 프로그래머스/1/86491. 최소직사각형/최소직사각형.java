class Solution {
    public int solution(int[][] sizes) {
    	int width = 0;
    	int height = 0;
        for (int[] size : sizes) {
        	int max = size[0] > size[1] ? size[0] : size[1];
			int min = size[0] > size[1] ? size[1] : size[0];
	        
			if(max > width) width = max;
			if(min > height) height = min;			
		}
        return width * height;
    }
}