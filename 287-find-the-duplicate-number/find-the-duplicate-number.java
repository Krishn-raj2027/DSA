import java.util.HashSet;

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                return num; // duplicate मिला
            }
            seen.add(num);
        }
        
        return -1; // अगर duplicate नहीं मिला
    }
}
