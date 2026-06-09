1class Solution {
2    public long maxTotalValue(int[] a, int k) {
3       int min=Integer.MAX_VALUE;
4        int max=Integer.MIN_VALUE;
5        for(int num:a){
6            min=Math.min(min,num);
7            max=Math.max(max,num);
8        }
9        return (long)k*(max-min);
10    }
11}