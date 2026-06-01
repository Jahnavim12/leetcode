1class Solution {
2    public boolean increasingTriplet(int[] nums) {
3       int f=Integer.MAX_VALUE; 
4       int s=Integer.MAX_VALUE; 
5       for(int n:nums){
6        if(n<=f){
7            f=n;
8        }
9        else if(n<=s){
10            s=n;
11        }
12        else{
13            return true;
14        }
15       }
16       return false;
17    }
18}