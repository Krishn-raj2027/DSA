class Solution {
    public List<String> generateParenthesis(int n) {
		List<String>M = new ArrayList<>();
		parentheses(n,0,0,"",M);
		return M;

	}
	public static void parentheses(int n, int open, int close, String ans,List<String> M) {
	if(open == n && close == n) {
		//System.out.println(ans+" ");
		M.add(ans);
		return;
	}
	if(open<n) {
		parentheses(n,open+1,close,ans+"(",M);
	}
	if(close<open) {
		parentheses(n,open,close+1,ans+")",M);
	}
    }
    
	
}
