1class Solution {
2    public String reverseVowels(String s) {
3        char[] c=s.toCharArray();
4        int i=0,j=c.length-1;
5        String v="aeiouAEIOU";
6        while(i<j){
7            while(i<j && v.indexOf(c[i])==-1) i++;
8            while(i<j && v.indexOf(c[j])==-1) j--;
9            char t=c[i];
10            c[i++]=c[j];
11            c[j--]=t;
12        }
13        return new String(c);
14    }
15}