1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n=nums.length;
4        int[] ans=new int[n];
5        ans[0]=1;
6        for(int i=1;i<n;i++){
7            ans[i]=ans[i-1]*nums[i-1];
8        }
9        int r=1;
10        for(int i=n-1;i>=0;i--){
11            ans[i]=ans[i]*r;
12            r*=nums[i];
13        }
14        return ans;
15    }
16}