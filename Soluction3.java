class Solutio3 {
    public int[] decimalRepresentation(int n) {
        int[] t = new int[10];
        int c = 0, p = 1;

        while (n > 0) {
            int d = n % 10;
            if (d != 0) t[c++] = d * p;
            n /= 10;
            p *= 10;
        }

        int[] r = new int[c];
        for (int i = 0; i < c; i++) {
            r[i] = t[c - 1 - i];
        }

        return r;
    }
}
©leetcode
