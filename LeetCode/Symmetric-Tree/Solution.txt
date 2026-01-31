1
2  public class TreeNode {
3      int val;
4      TreeNode left;
5      TreeNode right;
6      TreeNode() {}
7      TreeNode(int val) { this.val = val; }
8      TreeNode(int val, TreeNode left, TreeNode right) {
9         this.val = val;
10          this.left = left;
11       this.right = right;
12      }
13  }
14 
15class Solution {
16    public boolean isSymmetric(TreeNode root) {
17        if (root==null) return true;
18        return areMirror(root.left,root.right);
19    }
20    boolean areMirror(TreeNode p,TreeNode q){
21        if(p==null && q==null){
22            return true;
23        }
24        if(p==null|| q==null){
25            return false;
26        }
27        if(p.val != q.val){
28            return false;
29        }
30        return areMirror(p.left,q.right) && areMirror(p.right,q.left);
31    }
32}