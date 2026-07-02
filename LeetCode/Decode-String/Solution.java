1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> countStack = new Stack<>();
4        Stack<StringBuilder> stringStack = new Stack<>();
5        StringBuilder current = new StringBuilder();
6        int k = 0;
7        for (char ch : s.toCharArray()) {
8            if (Character.isDigit(ch)) {
9                k = k * 10 + (ch - '0');
10            } else if (ch == '[') {
11                countStack.push(k);
12                stringStack.push(current);
13                current = new StringBuilder();
14                k = 0;
15            } else if (ch == ']') {
16                int repeat = countStack.pop();
17                StringBuilder prev = stringStack.pop();
18                while (repeat-- > 0) {
19                    prev.append(current);
20                }
21                current = prev;
22            } else {
23                current.append(ch);
24            }
25        }
26        return current.toString();
27    }
28}