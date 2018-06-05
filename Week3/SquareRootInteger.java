public class Solution {
    /**
     * Non optimal approach would be to go from 1 to i*i<a
     * but using Binary Search, we can split 0 to a into half each time.
     */
    public int sqrt(int a) {
        if(a ==0 || a == 1)
            return a;
        long start = 1, end =a, result = 0;
        while(start<=end) {
            long  mid = (start+end)/2;
            //a is perfect square.
            if(mid*mid == a) {
                return (int)mid;
            } else if(mid*mid < a){
                start = mid + 1;
                result = mid;
            } else {
                end = mid -1;
            }
        }
        return (int)result;  
    }
}
