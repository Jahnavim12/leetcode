1class Solution {
2    public int maxProfit(int[] prices) {
3        int mp=Integer.MAX_VALUE;
4        int maxp=0;
5        for(int p:prices){
6            mp=Math.min(mp,p);
7            maxp=Math.max(maxp,p-mp);
8        }
9        return maxp;
10    }
11}