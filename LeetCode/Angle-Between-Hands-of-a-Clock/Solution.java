1class Solution {
2    public double angleClock(int hour, int minutes) {
3        double min=6*minutes;
4        double hrs=30*(hour%12)+0.5*minutes;
5        double diff=Math.abs(hrs-min);
6        return Math.min(diff,360-diff);
7    }
8}