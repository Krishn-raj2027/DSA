class Solution {
    public String simplifyPath(String path) {
     return Simplify(path);   
    }
    public static String Simplify(String str) {
		str = str.replaceAll("/+", "/");
		String[] parts = str.split("/");
		Stack<String> stack = new Stack<>();
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i<parts.length; i++) {
			if(parts[i].equals("") || parts[i].equals(".")) {
				continue;
			}
			if(parts[i].equals("..")) {
				if(!stack.isEmpty()) {
					stack.pop();
				}
			}
			else {
				stack.push(parts[i]);
			}
		}
		
		for(String s:stack) {
			ans.append("/").append(s);
		}
		if(ans.length()==0) {
			return"/";
		}else {
			return ans.toString();
		}
	}
}