1class Solution {
2    public List<Integer> countSmaller(int[] nums) {
3        List<Integer> ans = new ArrayList<>();
4        int mx = 20001;
5        ST stobj = new ST(mx);
6        for(int i = nums.length-1; i >= 0; i--) {
7            int x = nums[i];
8            x += 10000;
9            int smallerThanx = stobj.rangeQuery(0, x-1);
10            ans.add(smallerThanx);
11
12            stobj.incFreq(x);
13        }
14        Collections.reverse(ans);
15        return ans;
16    }
17}
18class ST{
19    int[] st;
20    int mxVal;
21
22    public ST(int mxVal) {
23        this.mxVal = mxVal;
24        this.st = new int[4 * (mxVal + 1)];
25    }
26
27    public int rangeQuery(int l, int r) {
28        if (l > r) return 0;
29        return rangeHelper(0, 0, mxVal, l, r);
30    }
31
32    private int rangeHelper(int idx, int ss, int se, int qs, int qe) {
33        if (se < qs || ss > qe) return 0;
34        if (ss >= qs && se <= qe) return st[idx];
35        
36        int mid = ss + (se - ss) / 2;
37        return rangeHelper(2 * idx + 1, ss, mid, qs, qe) + 
38               rangeHelper(2 * idx + 2, mid + 1, se, qs, qe);
39    }
40
41    public void incFreq(int val) {
42        update(0, 0, mxVal, val);
43    }
44
45    private void update(int idx, int ss, int se, int val) {
46        st[idx]++;
47        if (ss == se) return;
48
49        int mid = ss + (se - ss) / 2;
50        if (val <= mid) {
51            update(2 * idx + 1, ss, mid, val);
52        } else {
53            update(2 * idx + 2, mid + 1, se, val);
54        }
55    }
56}