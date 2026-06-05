class Solution {
    public int titleToNumber(String columnTitle) {
         return solve(columnTitle);
    }
     public static int solve(String str) {
		int ans = 0;
		for(int i = 0; i<str.length(); i++) {
			ans = ans*26 + (str.charAt(i) - 'A' + 1);
		}
		return ans;
		
	}
}