1class Solution {
2    public int maxSubArray(int[] nums) {
3        int cs = nums[0];
4        int ms = nums[0];
5        for (int i = 1; i < nums.length; i++){
6            cs = Math.max (nums[i], nums[i] + cs);
7            ms = Math.max (cs, ms);
8        }
9        return ms;
10    }
11}