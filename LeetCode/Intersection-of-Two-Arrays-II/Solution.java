1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        ArrayList<Integer> al=new ArrayList<>();
4        for(int i=0;i<nums1.length;i++){
5            for(int j=0;j<nums2.length;j++){
6                if(nums1[i]==nums2[j]){
7                    al.add(nums1[i]);
8                    nums2[j]=-1;
9                    break;
10                }
11            }
12        }
13        int[] ans =new int[al.size()];
14        for(int i=0;i<al.size();i++){
15            ans[i]=al.get(i);
16        }
17        return ans;
18    }
19}