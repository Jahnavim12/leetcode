class Solution {
    public int minEatingSpeed(int[] p, int h) {
        int l = 1, r = 0;
        for (int x : p) r = Math.max(r, x);
        int ans = r;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (isOk(p, h, m)) {
                ans = m;
                r = m - 1;
            } else l = m + 1;
        }
        return ans;
    }

    private boolean isOk(int[] p, int h, int k) {
        long t = 0;
        for (int x : p) t += (x + k - 1) / k;
        return t <= h;
    }
}
