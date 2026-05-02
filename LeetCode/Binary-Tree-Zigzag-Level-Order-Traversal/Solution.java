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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> res=new ArrayList<>();
19        if(root==null) return res;
20        Queue<TreeNode> q=new LinkedList<>();
21        q.offer(root);
22        boolean flag =true;
23        while(!q.isEmpty()){
24            int size=q.size();
25            List<Integer> lvl=new ArrayList<>();
26            for(int i=0;i<size;i++){
27                TreeNode curr=q.poll();
28                if(flag){
29                lvl.add(curr.val);
30                }
31                else{
32                    lvl.add(0,curr.val);
33                }
34                if(curr.left!=null){
35                    q.offer(curr.left);
36                }
37                
38               
39                if(curr.right!=null){
40                    q.offer(curr.right);
41                }
42                
43            }
44                res.add(lvl);
45                flag=!flag;
46        }
47        return res;
48    }
49}