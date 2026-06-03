class Solution {
    public boolean isPalindrome(String s) {
        return  Validpalindrome(s);
    }
    public static boolean Validpalindrome(String str) {
		str = str.toLowerCase();
		str = str.replaceAll("[^a-z0-9]","");
		return palindrome(str);
	}


	private static boolean palindrome(String st) {
		int i = 0;
		int j = st.length()-1;
		while(i<j) {
			if(st.charAt(i) != st.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}