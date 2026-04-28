1class Solution {
2    public int majorityElement(int[] nums) {
3        HashMap<Integer, Integer> hm = new HashMap<>();
4        for (int i = 0; i < nums.length; i++) {
5            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
6            if (hm.get(nums[i]) > nums.length / 2) {
7                return nums[i];
8            }
9        }
10        return -1;
11    }
12}