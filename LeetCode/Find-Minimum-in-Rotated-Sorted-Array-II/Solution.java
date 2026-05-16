1class Solution {
2    public int findMin(int[] nums) {
3        Arrays.sort(nums);
4        return nums[0];
5    }
6}