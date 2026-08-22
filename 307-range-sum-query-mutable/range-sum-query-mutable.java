class NumArray {
    int[] a;
    int[] st;
    int n;

    public NumArray(int[] nums) {
        n = nums.length;
        a = new int[n];
        for (int i = 0; i < n; i++) { 
            a[i] = nums[i]; 
        }
        st = new int[4 * n];
        build_st(0, 0, n - 1);
    }

    private void build_st(int idx, int ss, int se) {
        if (ss > se) return;
        if (ss == se) {
            st[idx] = a[ss];
            return;
        }
        int m = (ss + se) / 2;
        build_st(2 * idx + 1, ss, m);
        build_st(2 * idx + 2, m + 1, se);
        st[idx] = st[2 * idx + 1] + st[2 * idx + 2];
    }

    private void update_st(int idx, int ss, int se, int pos, int val) {
        if (ss == se) {
            a[pos] = val;
            st[idx] = val;
            return;
        }
        int m = (ss + se) / 2;
        if (pos <= m) {
            update_st(2 * idx + 1, ss, m, pos, val);
        } else {
            update_st(2 * idx + 2, m + 1, se, pos, val);
        }
        st[idx] = st[2 * idx + 1] + st[2 * idx + 2];
    }

    private int rangeSum(int idx, int ss, int se, int qs, int qe) {
        if (qe < ss || qs > se) return 0;
        if (ss >= qs && se <= qe) return st[idx];
        int m = (ss + se) / 2;
        int leftans = rangeSum(2 * idx + 1, ss, m, qs, qe);
        int rightans = rangeSum(2 * idx + 2, m + 1, se, qs, qe);
        return leftans + rightans;
    }

    public void update(int index, int val) {
        if (index < 0 || index >= n) return;
        update_st(0, 0, n - 1, index, val);
    }

    public int sumRange(int left, int right) {
        return rangeSum(0, 0, n - 1, left, right);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */