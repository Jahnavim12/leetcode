1class RecentCounter {
2    Queue<Integer> q;
3    public RecentCounter() {
4       q=new LinkedList<>(); 
5    }
6    
7    public int ping(int t) {
8        q.offer(t);
9    
10    while(q.peek()<t-3000){
11        q.poll();
12    }  
13    
14     return q.size();
15     }
16}
17
18/**
19 * Your RecentCounter object will be instantiated and called as such:
20 * RecentCounter obj = new RecentCounter();
21 * int param_1 = obj.ping(t);
22 */