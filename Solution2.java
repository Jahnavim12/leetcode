class Solution2 {
    public String majorityFrequencyGroup(String s) {
        int[] c = new int[26];
        for (char ch : s.toCharArray()) c[ch - 'a']++;

        int[] g = new int[101];
        for (int i = 0; i < 26; i++) if (c[i] > 0) g[c[i]]++;

        int m = 0, f = 0;
        for (int i = 1; i <= 100; i++)
            if (g[i] > m || (g[i] == m && i > f)) {
                m = g[i];
                f = i;
            }

        String r = "";
        for (int i = 0; i < 26; i++) if (c[i] == f) r += (char) (i + 'a');
        return r;
    }
}
©leetcode
