1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()) return false;
4        Map<Character,Integer> freq=new HashMap<>();
5        for(char ch:s.toCharArray()){
6            freq.put(ch,freq.getOrDefault(ch,0)+1);
7        }
8       for(char ch:t.toCharArray()){
9        if(!freq.containsKey(ch)){
10          return false;
11        }
12        else{
13            freq.put(ch,freq.get(ch)-1);
14            if(freq.get(ch)==0)
15            freq.remove(ch);
16        }
17       }
18       return freq.isEmpty();
19    }
20}