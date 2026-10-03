class Solution {

    static final long MOD = 1_000_000_007;

    String limit;
    int minSum;
    int maxSum;

    
    long[][][] dp;

    long solve(int position, int sum, boolean tight) {

        if (sum > maxSum)
            return 0;

        if (position == limit.length()) {

            if (sum >= minSum && sum <= maxSum)
                return 1;

            return 0;
        }

    
        int tightIndex = tight ? 1 : 0;

        
        if (dp[position][sum][tightIndex] != -1)
            return dp[position][sum][tightIndex];

        
        int currentLimitDigit = limit.charAt(position) - '0';

        
        int maxDigit;

        if (tight)
            maxDigit = currentLimitDigit;
        else
            maxDigit = 9;

        long count = 0;

    
        for (int digit = 0; digit <= maxDigit; digit++) {

            int newSum = sum + digit;

    
            boolean newTight = tight && (digit == currentLimitDigit);

            count += solve(position + 1, newSum, newTight);

            count %= MOD;
        }

    
        dp[position][sum][tightIndex] = count;

        return count;
    }

    long count(String number) {

        limit = number;

        int length = limit.length();

        dp = new long[length][maxSum + 1][2];

        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= maxSum; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(0, 0, true);
    }

    String subtractOne(String number) {

        char[] digits = number.toCharArray();

        int i = digits.length - 1;

        while (digits[i] == '0') {
            digits[i] = '9';
            i--;
        }

        digits[i]--;

    
        int start = 0;

        while (start < digits.length - 1 && digits[start] == '0') {
            start++;
        }

        return new String(digits, start, digits.length - start);
    }

    public int count(String num1, String num2, int min_sum, int max_sum) {

        this.minSum = min_sum;
        this.maxSum = max_sum;
        long right = count(num2);

        String num1MinusOne = subtractOne(num1);
        long left = count(num1MinusOne);

        long answer = (right - left + MOD) % MOD;

        return (int) answer;
    }
}