class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length(), pattern_len=1;
        while(pattern_len<=n/2){
            if(n%pattern_len!=0){
                pattern_len++;
                continue;
            }
            String sub=s.substring(0,pattern_len);
            StringBuilder sb=new StringBuilder();
            int num=n/pattern_len;
            for(int i=0;i<num;i++){
                sb.append(sub);
            }
            if(sb.toString().equals(s)) return true;
            pattern_len++;
            
        }
        return false;
        
    }
}