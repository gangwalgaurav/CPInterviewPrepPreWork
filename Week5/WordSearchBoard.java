public class Solution {
    public int exist(ArrayList<String> A, String B) {
        int n = A.size();
        for(int i=0;i<n;i++){
            char[] AStr = A.get(i).toCharArray();
            int m = AStr.length;
            for(int j=0;j<m;j++){
                if(B.charAt(0)==AStr[j]){
                    if(find(A,B.substring(1),i,j+1)
                            || find(A,B.substring(1),i,j-1) 
                            || find(A,B.substring(1),i+1,j) 
                            || find(A,B.substring(1),i-1,j)){
                                return 1;
                    }
                }
            }
        }
        
        return 0;
    }
    
    public boolean find(ArrayList<String> A, String B, int i, int j ){
    
        if(i>=A.size() || i<0 || j>=A.get(i).length() || j<0)
            return false;
        if(B.isEmpty())
            return true;
        char ch = B.charAt(0);
        if(A.get(i).charAt(j)!=ch)
            return false;
        return find(A,B.substring(1),i,j+1) || find(A,B.substring(1),i,j-1) 
                || find(A,B.substring(1),i+1,j)|| find(A,B.substring(1),i-1,j);
        
    }
}

