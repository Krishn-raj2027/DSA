class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals by start value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> ans = new ArrayList<>();

        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];

        // Step 2: Compare with remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (nextStart <= currentEnd) {
                // Overlap
                currentEnd = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap
                ans.add(new int[]{currentStart, currentEnd});

                currentStart = nextStart;
                currentEnd = nextEnd;
            }
        }

        // Step 3: Add the last merged interval
        ans.add(new int[]{currentStart, currentEnd});

        // Step 4: Convert ArrayList to int[][]
        return ans.toArray(new int[ans.size()][]);
    }
}