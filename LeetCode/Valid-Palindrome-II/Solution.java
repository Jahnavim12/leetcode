1class Solution {
2    public boolean validPalindrome(String s) {
3        int i=0,j=s.length()-1;
4        while(i<j){
5            if(s.charAt(i)!=s.charAt(j)){
6                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
7            }
8            i++;
9            j--;
10        }
11        return true;
12    }
13    private boolean isPalindrome(String s,int i,int j){
14        while(i<j){
15            if(s.charAt(i) != s.charAt(j)){
16                return false;
17            }
18            i++;
19            j--;
20        }
21        return true;
22    }
23}