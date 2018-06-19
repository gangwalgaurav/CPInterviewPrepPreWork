ipublic class Solution {
    public int[][] combinationSum(int[] A, int B) {
        
        ArrayList<ArrayList<Integer>> resL = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(A);
        combinationSum(A,resL,new ArrayList<Integer>(),B,0);
        //Converting the 2D arraylist to 2D array.
        int [][] res = new int[resL.size()][];
        for(int i=0;i<resL.size();i++){
            int [] combination = new int[resL.get(i).size()];
            for(int j=0;j<resL.get(i).size();j++){
                combination[j] = resL.get(i).get(j);
            }
            res[i] = combination;
        }
        return res;
    }
    public void combinationSum(int[] A,ArrayList<ArrayList<Integer>>res,ArrayList<Integer> list,int leftOverSum,int start ){
        if(leftOverSum<0){
            return;
        }
        if(leftOverSum==0) {
//            System.out.println(list.toString());
            res.add(new ArrayList<Integer>(list));
        }
        for(int i=start;i<A.length;i++){
            if (shouldSkip(A,i)==true){
                continue; 
             }
            list.add(A[i]);
            combinationSum(A,res,list,leftOverSum-A[i],i);
            list.remove(list.size()-1);
        }
    }
    /**
     * Should Skip if we have seen this element before.
     * @param A
     * @param index
     * @return
     */
    public boolean shouldSkip(int [] A,int index){
        if(index==0)
            return false;
        for(int i=index-1;i>=0;i--){
            if(A[i]==A[index])
                return true;
            if(A[i]<A[index])
                return false;
        }
        return false;
    }
}

