class Solution {
    public String reverseWords(String s) {
        return reverse(s);
    }
    public static String reverse(String str){
        str = str.trim();
        String[] arr = str.split("\\s+");
        String ans = "";
        for(int i = arr.length-1; i>=0; i--){
            ans = ans + arr[i]+ " ";

        }
        return ans.trim();
    }
}