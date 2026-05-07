class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return Search(matrix, target);
    }
    public static boolean Search(int[][] krishn,int target) {
		for(int i = 0; i<krishn.length; i++) {
			for(int j = 0; j<krishn[0].length; j++) {
				if(krishn[i][j]==target) {
					return true;
				}
				
			}
		
	     }
		return false;
	  } 
	}