class Solution {
    public int maxVowels(String s, int k) {
        int c=0,max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)) c++;
            if(i>=k && isVowel(s.charAt(i-k))){
                c--;
            }
            max=Math.max(max,c);
        }
        return max;
    }
    private boolean isVowel(char ch){
        return ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}