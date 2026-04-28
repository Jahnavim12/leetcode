1class Solution {
2    public int majorityElement(int[] nums) {
3       int can=0;
4       int count=0;
5       for(int i: nums){
6        if(count==0) can=i;
7        if(can==i) count++;
8        else count--;
9       }
10       return can;
11    }
12}