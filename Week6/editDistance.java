public class Solution {
    public int minDistance(String A, String B) {
        
        int m = A.length();
        int n = B.length();

        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0; i <= m; i++)
            dp[i][0] = i;
        for(int i = 1; i <= n; i++)
            dp[0][i] = i;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(A.charAt(i) == B.charAt(j))
                    dp[i + 1][j + 1] = dp[i][j];
                else {
                    int a = dp[i][j];
                    int b = dp[i][j + 1];
                    int c = dp[i + 1][j];
                    dp[i + 1][j + 1] = Math.min(Math.min(a, b),c);
                    dp[i + 1][j + 1]++;
                }
            }
        }
        return dp[m][n];
    
    }
}

