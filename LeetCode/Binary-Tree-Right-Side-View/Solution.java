1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> res=new ArrayList<>();
19        if(root==null) return res;
20        Queue<TreeNode> q=new LinkedList<>();
21        q.offer(root);
22        while(!q.isEmpty()){
23            int s=q.size();
24            for(int i=1;i<=s;i++){
25                TreeNode curr=q.poll();
26                if(i==s){
27                    res.add(curr.val);
28                }
29                if(curr.left!=null){
30                    q.offer(curr.left);
31                }
32                if(curr.right!=null){
33                    q.add(curr.right);
34                }
35            }
36        }
37        return res;
38    }
39}