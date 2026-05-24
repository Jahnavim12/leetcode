1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        StringBuilder res=new StringBuilder();
4        int i=0,j=0;
5        while(i<word1.length() || j<word2.length()){
6            
7         if(i<word1.length()){
8                res.append(word1.charAt(i++));
9         }
10         if(j<word2.length()){
11                res.append(word2.charAt(j++));
12         }
13            }
14        return res.toString();
15    }
16}