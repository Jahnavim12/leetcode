1class Solution {
2    public int maxVowels(String s, int k) {
3        int c=0,max=0;
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(isVowel(ch)) c++;
7            if(i>=k && isVowel(s.charAt(i-k))){
8                c--;
9            }
10            max=Math.max(max,c);
11        }
12        return max;
13    }
14    private boolean isVowel(char ch){
15        return ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u';
16    }
17}