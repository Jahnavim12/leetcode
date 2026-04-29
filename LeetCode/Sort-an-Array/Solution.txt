1class Solution {
2    static void merge(int[] a, int low, int mid, int high) {
3        int i = low;
4        int j = mid + 1;
5        int k = 0;
6        int[] t = new int[high - low + 1];
7        while (i <= mid && j <= high) {
8            if (a[i] <= a[j]) {
9                t[k++] = a[i++];
10            } else {
11                t[k++] = a[j++];
12            }
13        }
14        while (i <= mid) {
15            t[k++] = a[i++];
16        }
17        while (j <= high) {
18            t[k++] = a[j++];
19        }
20        for (i = 0; i < t.length; i++) {
21            a[low + i] = t[i];
22        }
23    }
24    static void sortArray(int[] nums, int low, int high) {
25        if (low >= high) return;
26        int mid = (low + high) / 2;
27        sortArray(nums, low, mid);
28        sortArray(nums, mid + 1, high);
29        merge(nums, low, mid, high);
30    }
31    public int[] sortArray(int[] nums) {
32        if (nums == null || nums.length <= 1) return nums;
33        sortArray(nums, 0, nums.length - 1);
34        return nums;
35    }
36}