1class Solution {
2    public void moveZeroes(int[] nums) {
3        int pos=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]!=0){
6                nums[pos]=nums[i];
7                pos++;
8            }
9        }
10        while(pos<nums.length){
11            nums[pos]=0;
12            pos++;
13        }
14    }
15}