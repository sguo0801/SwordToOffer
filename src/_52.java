public class _52 {
    public class Solution {
        public boolean match(char[] str, char[] pattern) {
            int m = str.length;
            int n = pattern.length;
            boolean[][] dp = new boolean[m + 1][n + 1];
            dp[0][0] = true;  //##先初始定位true
            for (int i = 2; i <= n; i++) {
                if (pattern[i - 1] == '*') {
                    dp[0][i] = dp[0][i - 2];
                }
            }

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (str[i - 1] == pattern[j - 1] || pattern[j - 1] == '.') {
                        dp[i][j] = dp[i - 1][j - 1];
                    }

                    if (pattern[j - 1] == '*') {
                        if (pattern[j - 2] != str[i-1] && pattern[j - 2] != '.') {//##同时的关系&&
                            dp[i][j] = dp[i][j - 2];
                        } else {
                            dp[i][j] = dp[i][j - 1] || dp[i - 1][j] || dp[i][j - 2];
                        }
                    }
                }
            }
            return dp[m][n];

        }
    }
}
