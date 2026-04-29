1class Solution {
2    static boolean cp(String str){
3        int l=0;
4        int r=str.length()-1;
5        while(l<r){
6            if(str.charAt(l)!=str.charAt(r)) return false;
7            l++;
8            r--;
9        }
10        return true;
11    }
12    public boolean isPalindrome(String s) {
13        StringBuilder st=new StringBuilder();
14        for(char ch: s.toCharArray()){
15            if(Character.isLetterOrDigit(ch)){
16                st.append(Character.toLowerCase(ch));
17            }
18        }
19        return cp(st.toString());
20    }
21}