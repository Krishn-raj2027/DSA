class Solution {
    public int lengthOfLongestSubstring(String s) {
        return substring(s);
    }
    public static int substring(String str){
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;

        for(int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);

            while(set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            max = Math.max(max , right - left + 1);

        }
        return max;
    }
}