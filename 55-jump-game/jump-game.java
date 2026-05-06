class Solution {
    public boolean canJump(int[] nums) {
         return Game(nums);
    }
     public static boolean Game(int[]  arr){
        int n = arr.length;
        if (n==1) return true;
        int farthest = 0;
        for(int i = 0; i<=n-2; i++ ){
            if(i>farthest){
                return false;
            }
            farthest = Math.max(farthest, i + arr[i]);
            if (farthest>=n-1){
                return true;
            }
                
            }
            return false;
        }
        
    }