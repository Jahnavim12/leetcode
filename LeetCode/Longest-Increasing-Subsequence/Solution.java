1class Solution {
2
3    public int lengthOfLIS(int[] nums) {
4   
5        Set<Integer> st=new TreeSet<>();
6        for(int x:nums){
7            st.add(x);
8        }
9        int[] nums2=new int[st.size()];
10        int i=0;
11        for(int x:st){
12            nums2[i]=x;
13            i++; 
14        }
15
16        return lcslen(nums,nums2);
17    }
18    int lcslen(int[] a,int[] b){
19        int n1=a.length;
20        int n2=b.length;
21       int[][] dp=new int[n1+1][n2+1];
22         for(int i=n1-1;i>=0;i--){
23            for(int j=n2-1;j>=0;j--){
24                if(a[i]==b[j]){
25                     dp[i][j]=1+dp[i+1][j+1];
26                }
27                else{
28                     dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
29                }
30            }
31        }
32        return dp[0][0];
33    }
34}