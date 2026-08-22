class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int mx = 20001;
        ST stobj = new ST(mx);
        for(int i = nums.length-1; i >= 0; i--) {
            int x = nums[i];
            x += 10000;
            int smallerThanx = stobj.rangeQuery(0, x-1);
            ans.add(smallerThanx);

            stobj.incFreq(x);
        }
        Collections.reverse(ans);
        return ans;
    }
}
class ST{
    int[] st;
    int mxVal;

    public ST(int mxVal) {
        this.mxVal = mxVal;
        this.st = new int[4 * (mxVal + 1)];
    }

    public int rangeQuery(int l, int r) {
        if (l > r) return 0;
        return rangeHelper(0, 0, mxVal, l, r);
    }

    private int rangeHelper(int idx, int ss, int se, int qs, int qe) {
        if (se < qs || ss > qe) return 0;
        if (ss >= qs && se <= qe) return st[idx];
        
        int mid = ss + (se - ss) / 2;
        return rangeHelper(2 * idx + 1, ss, mid, qs, qe) + 
               rangeHelper(2 * idx + 2, mid + 1, se, qs, qe);
    }

    public void incFreq(int val) {
        update(0, 0, mxVal, val);
    }

    private void update(int idx, int ss, int se, int val) {
        st[idx]++;
        if (ss == se) return;

        int mid = ss + (se - ss) / 2;
        if (val <= mid) {
            update(2 * idx + 1, ss, mid, val);
        } else {
            update(2 * idx + 2, mid + 1, se, val);
        }
    }
}