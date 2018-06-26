public class Solution {
    public int climbStairs(int A) {   
        if(A<=1)
            return 1;
        return climbStairs(A-1) + climbStairs(A-2);
    }
    public static HashMap<Integer,Integer> memo = new HashMap<Integer,Integer>();
    public int climbStairsMemo(int A) {
        if(A<=1){
            memo.put(A,1);
            return 1;
            
        }
        int a_1 = 0;
        if(memo.containsKey(A-1)){
            a_1 = memo.get(A-1);
        } else{
            a_1 = climbStairs(A-1);
            memo.put(A-1,a_1);
        }
        int a_2 = 0;
        if(memo.containsKey(A-2)){
            a_2 = memo.get(A-2);
        } else{
            a_2 = climbStairs(A-2);
            memo.put(A-2,a_2);
        }
        return a_1 + a_2;
    }


}

