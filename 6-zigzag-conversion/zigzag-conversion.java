class Solution {
    public String convert(String s, int numRows) {
     return Zigzag(s , numRows);
    }
     public static String Zigzag(String str , int numRows) {
        if(numRows == 1 || str.length() <= numRows)
            return str;

        StringBuilder ans = new StringBuilder();
        int cycle = 2 * numRows - 2;

        for(int row = 0; row < numRows; row++) {
            for(int j = row; j < str.length(); j += cycle) {
             
                ans.append(str.charAt(j));

               
                int diagonal = j + cycle - 2 * row;

                if(row != 0 &&
                   row != numRows - 1 &&
                   diagonal < str.length()) {
                    ans.append(str.charAt(diagonal));
                }
            }
        }
        return ans.toString();
    }
}

