1class Solution {
2    public int earliestFinishTime(int[] ls, int[] ld, int[] ws, int[] wd) {
3        int ans = Integer.MAX_VALUE, l = Integer.MAX_VALUE, w = Integer.MAX_VALUE;
4
5        for (int i = 0; i < ls.length; i++)
6            l = Math.min(l, ls[i] + ld[i]);
7
8        for (int i = 0; i < ws.length; i++)
9            ans = Math.min(ans, Math.max(l, ws[i]) + wd[i]);
10
11        for (int i = 0; i < ws.length; i++)
12            w = Math.min(w, ws[i] + wd[i]);
13
14        for (int i = 0; i < ls.length; i++)
15            ans = Math.min(ans, Math.max(w, ls[i]) + ld[i]);
16        return ans;
17    }
18}