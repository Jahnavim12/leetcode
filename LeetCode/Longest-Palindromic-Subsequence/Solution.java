1class Solution {
2    public int longestPalindromeSubseq(String s) {
3         int n=s.length();
4        StringBuilder rev=new StringBuilder(s);
5        String reversed=rev.reverse().toString();
6
7        int[][] dp=new int[n+1][n+1];
8        for(int i=n-1;i>=0;i--){
9            for(int j=n-1;j>=0;j--){
10                if(s.charAt(i)==reversed.charAt(j)){
11                    dp[i][j]=1+dp[i+1][j+1];
12                }
13                else{
14                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
15                }
16            }
17        }
18        return dp[0][0];
19    }
20}