class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;

        // First window ke vowels count karo
        for (int i = 0; i < k; i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        int maxCount = count;

        // Sliding window
        for (int i = k; i < s.length(); i++) {

            char leftChar = Character.toLowerCase(s.charAt(i - k));
            char rightChar = Character.toLowerCase(s.charAt(i));

            if (leftChar == 'a' || leftChar == 'e' || leftChar == 'i' ||
                leftChar == 'o' || leftChar == 'u') {
                count--;
            }

            if (rightChar == 'a' || rightChar == 'e' || rightChar == 'i' ||
                rightChar == 'o' || rightChar == 'u') {
                count++;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}