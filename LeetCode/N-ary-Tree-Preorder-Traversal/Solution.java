1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17};
18*/
19
20class Solution {
21    public List<Integer> preorder(Node root) {
22        List<Integer> ans=new ArrayList<>();
23        h(root,ans);
24        return ans;
25    }
26    void h(Node root,List<Integer> a){
27        if(root==null) return;
28        a.add(root.val);
29        for(Node child: root.children){
30            h(child,a);
31        }
32    }
33}