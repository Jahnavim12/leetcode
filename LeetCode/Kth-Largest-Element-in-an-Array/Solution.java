1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
4        for(int i:nums){
5            pq.add(i);
6        }
7        while(--k>0){
8            pq.poll();
9
10        }
11        return pq.peek();
12    }
13}