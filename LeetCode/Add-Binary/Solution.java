1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder sb=new StringBuilder();
4        int al=a.length()-1;
5        int bl=b.length()-1;
6        int c=0;
7        while(al>=0||bl>=0||c==1){
8            int add=c;
9            if(al>=0){
10                add+=a.charAt(al)-'0';
11                al--;
12            }
13            if(bl>=0){
14                add+=b.charAt(bl)-'0';
15                bl--;
16            }
17            sb.append(add%2);
18            c=add/2;
19        }
20        return sb.reverse().toString();
21    }
22}