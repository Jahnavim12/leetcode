class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int x:nums1) s1.add(x);
        for(int x:nums2) s2.add(x);
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int x:s2){
            if(!s1.contains(x)) l2.add(x);
        }

        for(int x:s1){
            if(!s2.contains(x)) l1.add(x);
        }
        return Arrays.asList(l1,l2);
    }
}