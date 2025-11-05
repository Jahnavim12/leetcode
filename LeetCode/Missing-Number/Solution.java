class Solution {
    public int missingNumber(int[] a) {
        int n=a.length,e=n*(n+1)/2,s=0;
        for(int x:a)
               s+=x;
        return e-s;
    }
}