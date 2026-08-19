class Solution {
public:
    int n1, n2;

    int solve(string& text1, int i, string& text2, int j, vector<vector<int>>& dp) {
        if (i >= n1 || j >= n2)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int take = 0, skipI = 0, skipJ = 0;

        if (text1[i] == text2[j]) {
            take = 1 + solve(text1, i + 1, text2, j + 1, dp);
        } else {
            skipI = solve(text1, i + 1, text2, j, dp);
            skipJ = solve(text1, i, text2, j + 1, dp);
        }

        return dp[i][j] = max({take, skipI, skipJ});
    }

    int longestCommonSubsequence(string text1, string text2) {
        n1 = text1.size();
        n2 = text2.size();

        vector<vector<int>> dp(n1, vector<int>(n2, -1));

        return solve(text1, 0, text2, 0, dp);
    }
};