1/**
2 * Definition for a binary tree node.
3 * struct TreeNode {
4 *     int val;
5 *     TreeNode *left;
6 *     TreeNode *right;
7 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
8 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
9 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
10 * };
11 */
12class Solution {
13public:
14    vector<vector<int>> levelOrder(TreeNode* root) {
15        vector<vector<int>> outer;
16        if(!root) return outer;
17        queue<TreeNode*> q;
18        q.push(root);
19        while(!q.empty()){
20            int sz=q.size();
21            vector<int> inner;
22            while(sz-->0){
23                auto f=q.front();
24                q.pop();
25                inner.push_back(f->val);
26                if(f->left) q.push(f->left);
27                if(f->right) q.push(f->right);
28            }
29            outer.push_back(inner);
30        }
31        return outer;
32    }
33};