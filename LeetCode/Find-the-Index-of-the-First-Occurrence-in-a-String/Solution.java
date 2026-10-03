1class Solution {
2    public int strStr(String h, String n) {
3        int l=h.length();
4        int m=n.length();
5        if(l<m) return -1;
6        int s=0;
7        while(s<=l-m){
8            int i=s,j=0;
9            while(i<l && j<m && h.charAt(i)==n.charAt(j)){
10                    i++;
11                    j++;
12                }
13                    if(j==m){
14                        return s;
15                         }
16                    s++;
17                
18        }
19        
20        return -1;
21    }
22}
23