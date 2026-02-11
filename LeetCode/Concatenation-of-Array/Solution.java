1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int n=nums.length;
4        int[] arr=new int[2*n];
5        for(int i=0;i<n;i++){
6            arr[i]=nums[i];
7            arr[n+i]=nums[i];
8        }
9        return arr;
10    }
11}