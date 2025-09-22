class Solution {
    public int romanToInt(String s) {
        int t = 0, p = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int c = val(s.charAt(i));
            t += (c < p) ? -c : c;
            p = c;
        }
        return t;
    }

    private int val(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
