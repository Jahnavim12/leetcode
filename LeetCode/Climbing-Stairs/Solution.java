1class Solution {
2    public int climbStairs(int n) {
3        if(n<=2) return n;
4        int f=1,s=2,ways=0;
5        for(int i=3;i<=n;i++){
6            ways=f+s;
7            f=s;
8            s=ways;
9        }
10        return ways;
11    }
12}