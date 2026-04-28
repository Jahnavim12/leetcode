1class Solution {
2    public int maxProduct(int[] nums) {
3        int n=nums.length;
4        int maxprod=nums[0], minprod=nums[0],result=nums[0];
5        for(int i=1;i<n;i++){
6            if(nums[i]<0){
7                int temp=maxprod;
8                maxprod=minprod;
9                minprod=temp;
10            }
11            maxprod=Math.max(nums[i],nums[i]*maxprod);
12            minprod=Math.min(nums[i],nums[i]*minprod);
13            result=Math.max(result,maxprod);
14        }
15        return result;
16    }
17}