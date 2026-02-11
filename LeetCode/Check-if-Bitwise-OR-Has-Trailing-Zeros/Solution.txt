1class Solution {
2    public boolean hasTrailingZeros(int[] nums) {
3        int count =0;
4        for(int i=0;i<nums.length;i++){
5            if((nums[i]&1)==0) count++;
6            // if(count>2) break;
7        }
8        return count>=2;
9    }
10}