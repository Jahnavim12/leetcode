1class Solution {
2    List<List<Integer>>  ans=new ArrayList<>();
3    List<Integer> temp=new ArrayList<>();
4    boolean[] used;
5    public List<List<Integer>> permute(int[] nums) {
6        used=new boolean[nums.length];
7        backtrack(nums);
8        return ans;
9
10    }
11    private void backtrack(int[] nums){
12        if(temp.size()==nums.length){
13            ans.add(new ArrayList<>(temp));
14            return;
15        }
16        for(int i=0;i<nums.length;i++){
17            if(used[i]) continue;
18            used[i]=true;
19            temp.add(nums[i]);
20            backtrack(nums);
21            temp.remove(temp.size()-1);
22            used[i]=false;
23        }
24    }
25}