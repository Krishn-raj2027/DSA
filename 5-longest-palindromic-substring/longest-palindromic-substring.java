class Solution {
    public String longestPalindrome(String s) {
        return substring(s);
    }
    public static String substring(String st) {
		String longest = "";
		for(int i = 0; i<st.length(); i++) {
			for(int j = i+1; j<= st.length(); j++) {
				String sub = st.substring(i, j);
				if(palindrome(sub) && sub.length()> longest.length()) {
					longest = sub; //update longest
					
				}
			}
		}
		return longest;
	}
	public static boolean palindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}