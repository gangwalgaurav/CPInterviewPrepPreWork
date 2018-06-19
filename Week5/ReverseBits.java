public class Solution {
    public long reverse(long a) {
        final int NO_BIT_UNS = 32;
        long reverse = 0;
        for(int i=0;i<NO_BIT_UNS;i++){
            // if((a & (1<<i))==1){
            //     reverse = reverse|(long)1<<(NO_BIT_UNS -1) -i);
            // }
            reverse = (reverse<<1) | (a&1);
            a=a>>1;
        }
        return reverse;
        
        
        // long reverse = 0;
        // while (a != 0) {
        //     reverse <<= 1;
        //     // if ((long)(a & 1) == 1)
        //     //     reverse ^= 1;
        //     reverse|=(a &1);
        //     a >>= 1;
        // }
        // return reverse;
    }
    
}

