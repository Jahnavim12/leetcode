1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        int n=s.length(), pattern_len=1;
4        while(pattern_len<=n/2){
5            if(n%pattern_len!=0){
6                pattern_len++;
7                continue;
8            }
9            String sub=s.substring(0,pattern_len);
10            StringBuilder sb=new StringBuilder();
11            int num=n/pattern_len;
12            for(int i=0;i<num;i++){
13                sb.append(sub);
14            }
15            if(sb.toString().equals(s)) return true;
16            pattern_len++;
17            
18        }
19        return false;
20        
21    }
22}