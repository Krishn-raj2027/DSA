class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; // frequency of each letter
        int left = 0, maxCount = 0, result = 0;

        for (int right = 0; right < s.length(); right++) {
            // update frequency
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            // check if window is valid
            while ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
