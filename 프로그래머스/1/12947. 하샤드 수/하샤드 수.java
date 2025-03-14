class Solution {
    public boolean solution(int x) {
        String xStr = String.valueOf(x);
        int sum = 0;

        for (int i = 0; i < xStr.length(); i++) {
			int c = xStr.charAt(i) - '0';
			sum+=c;
		} // for i
        return x%sum==0 ? true : false;
    }
}