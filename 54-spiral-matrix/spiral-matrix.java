class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        Sprial(matrix, result);
        return result;
    }
    public static void Sprial(int[][] arr, List<Integer> result) {
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length-1;
		
		int total_element= arr.length*arr[0].length;
		int count = 0;
		
		while(count<total_element) {
		//for(int i = minc; i<=maxc; i++) {
			for(int i = minc; i<=maxc && count< total_element; i++) {
            result.add(arr[minr][i]);
			count++;
		}
		minr++;
		//for(int i = minr; i<=maxr; i++){
		for(int i = minr; i<=maxr && count< total_element; i++) {
			result.add(arr[i][maxc]);
			count++;
		}
		maxc--;
		//for(int i = maxc; i>=minc; i++){
		for(int i = maxc; i>=minc && count< total_element; i--) {
			result.add(arr[maxr][i]);
			count++;
		}
		maxr--;
		//for(int i = maxr; i>=minr; i++){
		for(int i = maxr; i>=minr && count< total_element; i--) {
			result.add(arr[i][minc]);
			count++;
		}
		minc++;
	}
	}

}
