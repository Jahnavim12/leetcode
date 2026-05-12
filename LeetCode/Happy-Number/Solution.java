1class Solution {
2    public boolean isHappy(int n) {
3        HashSet<Integer> h=new HashSet<>();
4        while(n!=1 && !h.contains(n)){
5            h.add(n);
6            int sum=0;
7            while(n>0){
8                int d=n%10;
9                sum+=d*d;
10                n/=10;
11            }
12            n=sum;
13
14        }
15        return n==1;
16    }
17}