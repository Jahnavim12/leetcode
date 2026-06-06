1class Solution {
2    public int largestAltitude(int[] gain) {
3        int c=0,g=0;
4        for (int i:gain){
5            c+=i;
6            g=Math.max(c,g);
7
8        }
9        return g;
10    }
11}