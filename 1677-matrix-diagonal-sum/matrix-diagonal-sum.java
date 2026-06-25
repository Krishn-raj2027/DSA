class Solution {
    public int diagonalSum(int[][] mat) {
        return sumprint(mat);
    }
    public static int sumprint(int[][] arr) {
		int n = arr.length;
		int sum = 0;
		for(int i = 0; i<n; i++) {
			sum += arr[i][i];  //main digonals
			sum += arr[i][n-1-i];  // secondary digonals
		}
		if(n%2==1) {
			sum -= arr[n/2][n/2];
		}
		return sum;
		
	}
}