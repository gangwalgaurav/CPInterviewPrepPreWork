public class Solution {
    
/**
 *  0 ^ N = N
    N ^ N = 0
    So..... if N is the single number

    N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N

    = (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N

    = 0 ^ 0 ^ ..........^ 0 ^ N

    = N
 */
    
    
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int result =0;
        for(Integer item : A) {
            result = result ^ item;
        }
        return result;
    }
}

