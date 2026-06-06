class Solution {
    public String convertToTitle(int columnNumber) {
        return Solve(columnNumber);
    }
    public static String Solve(int n) {
        StringBuilder ans = new StringBuilder();
		while(n>0){
        n--;  
        char ch = (char)('A'+(n%26));
        ans.append(ch);
        n = n/26;
        }
        return ans.reverse().toString();
    } 
		
}