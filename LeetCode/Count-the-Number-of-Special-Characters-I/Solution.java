1class Solution {
2    public int numberOfSpecialChars(String word) {
3        HashSet<Character> low=new HashSet<>();
4        HashSet<Character> upp=new HashSet<>();
5        for(char ch:word.toCharArray()){
6            if(Character.isLowerCase(ch)){
7                low.add(ch);
8            }else{
9                upp.add(Character.toLowerCase(ch));
10            }
11        }
12        int c=0;
13    for(char ch:low){
14        if(upp.contains(ch)){
15            c++;
16        }
17    }
18    return c;
19    }
20}