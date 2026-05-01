1class MinStack {
2      Stack<Integer> st;
3      Stack<Integer> Minst;
4    public MinStack() {
5        st=new Stack<>();
6        Minst = new Stack<>();
7    }
8    
9    public void push(int val) {
10      if(Minst.isEmpty() || val<=Minst.peek()){
11      Minst.push(val);
12      }
13      st.push(val);  
14    }
15    
16    public void pop() {
17    if(st.peek().equals(Minst.peek())){
18        Minst.pop();
19    }
20    st.pop();
21}
22    
23    public int top() {
24        return st.peek();
25    }
26    
27    public int getMin() {
28        return Minst.peek();
29    }
30}
31
32/**
33 * Your MinStack object will be instantiated and called as such:
34 * MinStack obj = new MinStack();
35 * obj.push(val);
36 * obj.pop();
37 * int param_3 = obj.top();
38 * int param_4 = obj.getMin();
39 */