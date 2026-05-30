class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String word : strs){
            char[] a = word.toCharArray();
            Arrays.sort(a);
            String sorted = new String(a);

            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(word);
        }
       return new ArrayList<>(map.values());
    }
}