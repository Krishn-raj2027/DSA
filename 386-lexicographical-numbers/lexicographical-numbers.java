class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> k = new ArrayList<>();
		printcount(0,n,k);
		return k;
    }
    public static void printcount(int curr, int n,List<Integer> k) {
		if(curr>n) {
			return;
		}
//		System.out.println(curr);
		if(curr != 0) {
		k.add(curr);
		}
		
		int i = 0;
		if(curr == 0) {
			i = 1;
		}
		for(; i<=9; i++) {
			printcount(curr*10+i,n,k);
			
		}
		
		
	}
}