1class Solution {
2    public int countPrimes(int n) {
3          if(n<2) return 0;
4        boolean[] soe=new boolean[n];
5        Arrays.fill(soe,true);
6        soe[0]=soe[1]=false;
7        for(int i=2;i*i<=n;i++){
8            if(soe[i]){
9                for(int j=i*i;j<n;j=j+i){
10                    soe[j]=false;
11                }
12            }
13        }
14      
15        int count=0;
16        for(int i=2;i<n;i++){
17            if(soe[i]){
18                count++;
19            }
20        }
21        return count;
22    }
23}