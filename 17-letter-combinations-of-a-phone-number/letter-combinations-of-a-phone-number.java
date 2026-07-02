class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> k = new ArrayList<>();
        if(digits.length()==0){
            return k;
        }
		Printanswer(digits,"",k);
		return k;
    }
    static String[] code = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void Printanswer(String ques,String ans,List<String> k) {
		if(ques.length()==0) {
//			System.out.println(ans+"");
			k.add(ans);
			return;
		}
		char ch = ques.charAt(0);//2
		String Press = code[ch-48];//abc
		for(int i = 0; i<Press.length(); i++) {
			Printanswer(ques.substring(1),ans+Press.charAt(i),k);
			}
		}
}