1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) return false;
4        char[] ch=s.toCharArray();
5        char[] ch2=t.toCharArray();
6        Arrays.sort(ch);
7        Arrays.sort(ch2);
8        String str=new String(ch);
9        String str2=new String(ch2);
10        if(str.equals(str2)){
11            return true;
12        }
13        return false;
14    }
15}
16