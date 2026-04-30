1class Solution {
2    List<List<Integer>> res=new ArrayList<>();
3    List<Integer> temp=new ArrayList<>(); 
4    public List<List<Integer>> combinationSum(int[] candidates, int target) {
5        backtrack(0,candidates,target);
6        return res;
7    }
8    public void backtrack(int idx,int[] c,int t){
9        if(t==0){
10            res.add(new ArrayList<>(temp));
11            return;
12        }
13        for(int i=idx;i<c.length;i++){
14            if(c[i]>t){
15                continue; 
16            }
17            temp.add(c[i]);
18            backtrack(i,c,t-c[i]);
19            temp.remove(temp.size()-1);
20        }
21    }
22}