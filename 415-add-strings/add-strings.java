class Solution {
    public String addStrings(String num1, String num2) {
        return add(num1,num2);
    }
     public static String add(String nu1, String nu2) {
		 int i= nu1.length()-1;
		 int j = nu2.length()-1;
		 int carry = 0;
		 
		 StringBuilder ans = new StringBuilder();
		 while(i>=0 || j>=0 || carry!=0) {
			
			 int n1=0;
			 int n2=0;
			 
			 if(i>=0) {
				 n1 = nu1.charAt(i)-'0';
			 }else {
				 n1 = 0;
			 }
			
			 if(j>=0) {
				 n2 = nu2.charAt(j)-'0';
			 }
			 int sum = n1+n2+carry;
			 ans.append(sum%10);
			 carry = sum/10;
			 i--;
			 j--;
		    }
		 return ans.reverse().toString();
		 }

}