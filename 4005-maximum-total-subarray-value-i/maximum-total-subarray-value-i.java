class Solution {
    public long maxTotalValue(int[] a, int k) {
       int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:a){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        return (long)k*(max-min);
    }
}