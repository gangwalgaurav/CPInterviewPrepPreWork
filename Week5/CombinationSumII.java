public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Collections.sort(a);
        combinationSum(a,res,new ArrayList<Integer>(),b,0);
        return res;
    }
    
    public void combinationSum(ArrayList<Integer> A,ArrayList<ArrayList<Integer>>res,ArrayList<Integer> list,int leftOverSum,int start ){
        if(leftOverSum<0){
            return;
        }
        if(leftOverSum==0) {
            // System.out.println(list.toString());
            res.add(new ArrayList<Integer>(list));
        }
        for(int i=start;i<A.size();i++){
            if (i>start && A.get(i)==A.get(i-1)){
                continue; 
             }
            list.add(A.get(i));
            combinationSum(A,res,list,leftOverSum-A.get(i),i+1);
            list.remove(list.size()-1);
        }
    }
}

