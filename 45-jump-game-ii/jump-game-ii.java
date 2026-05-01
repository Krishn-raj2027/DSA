class Solution {
    public int jump(int[] nums) {
        return Game(nums);
    }
    public static int Game(int[]  arr){
        int n = arr.length;
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        for(int i = 0; i<=n-2; i++ ){
            farthest = Math.max(farthest, i + arr[i]);
            if (i ==currentEnd){
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}