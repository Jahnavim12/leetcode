1class Solution {
2
3    public int countPrimes(int n) {
4        boolean[] p=new boolean[n+1];
5        Arrays.fill(p,true);
6        if(n<2){
7            return 0;
8        }
9        p[0]=p[1]=false;
10        for(int i=2;i*i<=n;i++){
11            if(p[i]==true){
12                for(int j=i*i;j<=n;j=j+i){
13                    p[j]=false;
14                }
15            }
16        }
17        int count=0;
18        for(int i=0;i<n;i++){
19        if(p[i]){
20            count++;
21        }
22
23     }
24     return count;
25        
26    }
27}