1class Solution {
2    public int lastStoneWeight(int[] stones) {
3      PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
4      for(int s:stones){
5        pq.add(s);
6      }
7      while(pq.size()>1){
8        int m1=pq.remove();
9        int m2=pq.remove();
10        if(m1!=m2){
11            pq.add(m1-m2);
12        }
13      }
14      if(pq.isEmpty()) return 0;
15      return pq.peek();
16    
17    }
18}