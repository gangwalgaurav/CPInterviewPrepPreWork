public class Solution {
    public int divide(int A, int B) {
        int sign = 1;
        if((A>0 && B<0) || (A<0 && B>0))
            sign = -1;
        long unA = A>=0?A:-A;
        long unB = B>=0?B:-B;
        int result = (int)divideLong(unA,unB);
        return sign==1?result:-result;
    }
    public long divideLong(long dividend, long divisor) {
        if (dividend < divisor)
            return 0;
        
        if(dividend == divisor)
            return 1;
        long sum = divisor;
        long divide = 1;
        while ((sum+sum) <= dividend) {
            sum += sum;
            divide += divide;
        }
        
        return (divide + divideLong((dividend-sum), divisor));
    }
}

