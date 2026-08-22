1class Solution {
2    public int createSortedArray(int[] a) {
3        long ans=0;
4        int mx=100000;
5        int MOD = 1_000_000_007;
6        ST stobj=new ST(mx);
7        for(int x:a){
8            long cost1=stobj.rangeQuery(0,x-1);
9            long cost2=stobj.rangeQuery(x+1,mx);
10            ans=(ans+Math.min(cost1,cost2))%MOD;
11            System.out.println(Math.min(cost1,cost2));
12            stobj.incFreq(x);
13        }
14        return (int)ans;
15    }
16}
17class ST{
18    long[] st;int mxVal=0;
19    public ST(int mxVal){
20        st=new long[4*mxVal];
21        this.mxVal=mxVal;
22    }
23    long rangeQuery(int l,int r){
24        return rangeHelper(0,0,mxVal,l,r);
25    }
26    long rangeHelper(int idx,int ss,int se,int qs,int qe){
27        if(qe<ss || qs>se) return 0;
28        if(ss>=qs && se<=qe) return st[idx];
29        int mid=(ss+se)/2;
30        long leftans=rangeHelper(2*idx+1,ss,mid,qs,qe);
31        long rightans=rangeHelper(2*idx+2,mid+1,se,qs,qe);
32        return leftans+rightans;
33
34    }
35    void incFreq(int x){
36        int idx=0,ss=0,se=mxVal;
37        while(ss<se){
38            int mid=(ss+se)/2;
39            if(x<=mid){
40                idx=2*idx+1;
41                se=mid;
42            }
43            else{
44                idx=2*idx+2;
45                ss=mid+1;
46            }
47        }
48        while(true){
49            st[idx]+=1;
50            if(idx==0) break;
51            idx=(idx-1)/2;
52        }
53    }
54}