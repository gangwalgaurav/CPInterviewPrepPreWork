public class Solution {
    public int black(ArrayList<String> A) {
        int n = A.size();
        int m = A.get(0).length();
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A.get(i).charAt(j)=='X'){
                    count++;
                    markNeighbor(A,i,j);
                }
            }
        }
        return count;
    }
    public void markNeighbor(ArrayList<String> A, int i,int j){
        int n = A.size();
        int m = A.get(0).length();
        if(i<0||i>=n||j<0||j>=m ||A.get(i).charAt(j)!='X')
            return;
        //Should have used StringBuilder or charArray, but in the 
        //interest of time, using String only.
        A.set(i,A.get(i).substring(0,j)+'-'+A.get(i).substring(j+1));
        markNeighbor(A,i-1,j);
        markNeighbor(A,i+1,j);
        markNeighbor(A,i,j-1);
        markNeighbor(A,i,j+1);
    }
}

