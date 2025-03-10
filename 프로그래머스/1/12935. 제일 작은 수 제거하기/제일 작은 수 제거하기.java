class Solution {
    public int[] solution(int[] arr) {
    	if(arr.length == 1) return new int[] {-1};
    	int [] answer = new int[arr.length-1];
    	int min = arr[0];
    	for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) min = arr[i];
		} // for i
    	
    	int idx = 0;
    	for (int arrI : arr) {
    		if(arrI != min) answer[idx++] = arrI;
		} // foreach
    	return answer;
    }
}