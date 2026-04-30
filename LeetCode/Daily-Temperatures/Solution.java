1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3       int n=temperatures.length;
4       int[] ans=new int[n];
5       Stack<Integer> st=new Stack<>();
6       for(int i=0;i<n;i++){
7        while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
8            int idx=st.pop();
9            ans[idx]=i-idx;
10        }
11        st.push(i);
12       } 
13       return ans;
14    }
15}