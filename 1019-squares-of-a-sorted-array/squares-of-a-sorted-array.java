class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }
            else{
                pos.add(nums[i]);
            }  
        }
        //case1: if all positve
        if(neg.size() == 0){
            //square
            for(int i = 0; i<pos.size(); i++){
                pos.set(i,pos.get(i)*pos.get(i));
            }
                return pos.stream().mapToInt(Integer::intValue).toArray();

            }
            //case2:- if all negative
            if (pos.size() == 0) {
            for(int i = 0; i<neg.size(); i++){
                neg.set(i,neg.get(i)*neg.get(i));
            }
                Collections.reverse(neg);
                return neg.stream().mapToInt(Integer::intValue).toArray();

            }
            //case3 +ve and -ve both
            int i = 0, j= 0, id=0;
            int n1 = neg.size();
            int n2 = pos.size();
            int[] res = new int[n1+n2];

            //square negative and reverse them
           for (int k = 0; k < n1; k++) {
            neg.set(k, neg.get(k) * neg.get(k));
        }
        Collections.reverse(neg);

            //square postive
            for (int k = 0; k < n2; k++) {
            pos.set(k, pos.get(k) * pos.get(k));
        }
            //merge twp sorted lists
            while(i<n1 &&  j<n2){
                if(neg.get(i) <= pos.get(j)){
                res[id++] = neg.get(i++);
                //res[id]=neg[i];
                //id++;
                //i++
            }else{
                res[id++] = pos.get(j++);
            }
            
        }
        while(i<n1)
        res[id++] = neg.get(i++);
        
        while(j<n2)
            res[id++] = pos.get(j++);
        

    
    return res;
}
    }
