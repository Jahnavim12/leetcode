1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Map<Integer,Integer> nge=new HashMap<>();
4        Stack<Integer> st=new Stack<>();
5        for(int x: nums2){
6            while(!st.isEmpty() && st.peek()<x){
7                nge.put(st.pop(),x);
8            }
9            st.push(x);
10        }
11        while(!st.isEmpty()){
12            nge.put(st.pop(),-1);
13        }
14        int[] ans=new int[nums1.length];
15        for(int i=0;i<ans.length;i++){
16            ans[i]=nge.get(nums1[i]);
17        }
18        return ans;
19    }
20}