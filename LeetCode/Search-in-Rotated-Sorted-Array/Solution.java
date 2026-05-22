1class Solution {
2    public int search(int[] nums, int target) {
3        int ans=-1;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==target){
6                ans=i;
7            }
8        }
9        return ans;
10    }
11}