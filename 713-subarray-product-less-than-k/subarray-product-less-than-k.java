class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return countof_SubArray(nums,k);
    }
    public static int countof_SubArray(int[] arr,int k) {
		int start=0;
		int end=0;
		int product = 1;
		int ans = 0;
		while(end < arr.length) {
			//growing
			product*=arr[end];
			//Shrinking
			while(product>=k && start<=end) {
				product=product/arr[start];
				start++;
			}
			//ans calculate
			ans = ans+(end-start+1);
			end++;
		}
		return ans;
	}

}