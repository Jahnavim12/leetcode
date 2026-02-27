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
17    public List<Integer> preorderTraversal(TreeNode root) {
18       // if(root==null) return;
19        List<Integer> a=new ArrayList<>();
20        preOrderHelp(root,a);
21        return a;
22    }
23    void preOrderHelp(TreeNode root,List<Integer> ans){
24        if(root==null) return;
25        ans.add(root.val);
26        preOrderHelp(root.left,ans);
27        preOrderHelp(root.right,ans);
28    }
29}