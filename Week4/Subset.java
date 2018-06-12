public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<Integer> subset = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>(subset));
        subsetHelper(A, subset, result, 0);
        return result;
    }
    
    public void subsetHelper(ArrayList<Integer> A, ArrayList<Integer> subset,ArrayList<ArrayList<Integer>> result, int index){
        for(int i = index; i<A.size();i++){
            subset.add(A.get(i));
            result.add(new ArrayList<Integer>(subset));
            subsetHelper(A, subset, result, index+1);
            subset.remove(subset.size()-1);
        }
    }
}

