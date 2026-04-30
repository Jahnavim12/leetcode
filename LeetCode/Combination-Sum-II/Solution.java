1class Solution {
2    List<List<Integer>> res=new ArrayList<>();
3    List<Integer> temp=new ArrayList<>(); 
4    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
5        Arrays.sort(candidates);
6        backtrack(0,candidates,target);
7        return res;
8    }
9    public void backtrack(int idx,int[] c,int t){
10        if(t==0){
11            res.add(new ArrayList<>(temp));
12            return;
13        }
14        for(int i=idx;i<c.length;i++){
15            if(i>idx && c[i]==c[i-1]) continue; 
16            if(c[i]>t){
17                continue; 
18            }
19            temp.add(c[i]);
20            backtrack(i+1,c,t-c[i]);
21            temp.remove(temp.size()-1);
22        }
23    }
24}
25