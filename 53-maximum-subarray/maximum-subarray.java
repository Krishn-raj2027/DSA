class Solution {
    public int maxSubArray(int[] nums) {
        return MaxSum(nums);
    }
    public static int MaxSum(int[] arr) {
	int ans = Integer.MIN_VALUE;
    int sum = 0;
	for(int i = 0; i<arr.length; i++) {
			sum = sum+arr[i];
			ans = Math.max(sum,ans);
			if(sum<0) {
				sum=0;
		}
	}
	
	return ans;
}
}
