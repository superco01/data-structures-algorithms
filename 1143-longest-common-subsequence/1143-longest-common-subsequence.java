class Solution {
    int[][] memo;

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        
        memo = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }
        
        return lcs(text1, text2, n-1, m-1);
    }
    
    private int lcs(String text1, String text2, int i, int j) {
        if (i < 0 || j < 0) {
            return 0;
        }
        
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        
        if (text1.charAt(i) == text2.charAt(j)) {
            memo[i][j] = 1 + lcs(text1, text2, i-1, j-1);
        } else {
            memo[i][j] = Math.max(lcs(text1, text2, i-1, j), lcs(text1, text2, i, j-1));
        }
        
        return memo[i][j];
    }
}
