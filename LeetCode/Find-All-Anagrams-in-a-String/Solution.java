1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> res=new ArrayList<>();
4        int[] pcount=new int[26];
5        int[] scount=new int[26];
6        for(char c: p.toCharArray()){
7            pcount[c-'a']++;
8        }
9        for(int i=0;i<s.length();i++){
10            scount[s.charAt(i)-'a']++;
11
12            if(i>=p.length()){
13                scount[s.charAt(i-p.length())-'a']--;
14            }
15              if(Arrays.equals(scount,pcount)){
16                res.add(i-p.length()+1);
17              }
18        }
19        return res;
20    }
21}