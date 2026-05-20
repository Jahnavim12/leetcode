1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.length()!=goal.length()){
4            return false;
5        }
6        String d=s+s;
7        return d.contains(goal);
8    }
9}