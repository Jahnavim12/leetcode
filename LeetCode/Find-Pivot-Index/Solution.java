1class Solution {
2    public int pivotIndex(int[] nums) {
3        int t=0;
4        for(int n:nums){
5            t+=n;
6        }
7        int ls=0;
8        for(int i=0;i<nums.length;i++){
9            if(ls==t-ls-nums[i]){
10                return i;
11            }
12            ls+=nums[i];
13        }
14        return -1;
15    }
16}