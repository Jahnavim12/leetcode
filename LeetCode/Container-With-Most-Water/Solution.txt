1class Solution {
2    public int maxArea(int[] height) {
3        int l=0;
4        int r=height.length-1;
5        int res=0;
6        while(l<r){
7            int h= Math.min(height[l],height[r]);
8            int w=r-l;
9            int vol=h*w;
10            res=Math.max(res,vol);
11            if(height[l]<height[r]) l++;
12            else r--;
13        }
14        return res;
15    }
16}