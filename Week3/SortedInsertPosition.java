public class Solution {
    public int searchInsert(ArrayList<Integer> a, int b) {
        if(a==null || a.isEmpty())
            return 0;
        int low = 0;
        int high = a.size()-1;
        int mid = 0;
        if(b>a.get(high))
            return high+1;
        else if(b<a.get(low))
            return low;
        while(low<=high){
            mid = (low+high)/2;
            if(a.get(mid) == b)
                return mid;
            else if(a.get(mid) < b){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return a.get(mid)>b?mid:mid+1;
        
        
    }
}
